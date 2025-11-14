package grpc

import (
	"context"
	"fmt"
	"log"

	authv1 "github.com/samarthasthan/services-commons/gen/go/auth/v1"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/metadata"
	"google.golang.org/grpc/status"
)

func AuthUnaryInterceptor(authClient authv1.AuthServiceClient, skipMethods map[string]bool, requiredRoles map[string][]string) grpc.UnaryServerInterceptor {
	return func(
		ctx context.Context,
		req interface{},
		info *grpc.UnaryServerInfo,
		handler grpc.UnaryHandler,
	) (interface{}, error) {
		// Skip authentication for public methods (e.g. SignUp, SignIn)
		if skipMethods[info.FullMethod] {
			return handler(ctx, req)
		}

		// Extract token from metadata
		md, ok := metadata.FromIncomingContext(ctx)
		if !ok {
			return nil, status.Error(codes.Unauthenticated, "missing metadata")
		}

		outCtx := metadata.NewOutgoingContext(ctx, md)

		// Validate token via AuthService
		res, err := authClient.ValidateToken(outCtx, &authv1.ValidateTokenRequest{})
		if err != nil || !res.IsValid {
			log.Println("Invalid token in file service:", err)
			return nil, status.Error(codes.Unauthenticated, "invalid token")
		}

		// Role check
		if roles, ok := requiredRoles[info.FullMethod]; ok {
			hasRole := false
			for _, r := range roles {
				if r == res.Role {
					hasRole = true
					break
				}
			}
			if !hasRole {
				return nil, status.Error(codes.PermissionDenied, "insufficient role")
			}
		}

		md.Set("id", fmt.Sprint(res.GetUserId()))
		md.Set("user_id", res.GetExternalId())
		md.Set("email", res.GetEmail())
		md.Set("role", res.GetRole())
		// to call interlink grpc call (NewIncomingContext to NewOutgoingContext)
		outCtx = metadata.NewOutgoingContext(ctx, md)
		// Add user_id to the same incoming context
		outCtx = context.WithValue(outCtx, "id", res.GetUserId())
		outCtx = context.WithValue(outCtx, "user_id", res.GetExternalId())
		outCtx = context.WithValue(outCtx, "email", res.GetEmail())
		outCtx = context.WithValue(outCtx, "role", res.GetRole())
		// Proceed with actual handler using the enriched context
		return handler(outCtx, req)
	}
}
