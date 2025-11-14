package utils

import (
	"context"
	"strings"

	"github.com/jxskiss/base62"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

func GetUserFromCtx(ctx context.Context) (string, error) {
	userID, ok := ctx.Value("user_id").(string)
	if !ok || userID == "" {
		return "", status.Error(codes.Unauthenticated, "user_id not found in context")
	}
	return userID, nil
}

func EncodeID(id int64) string {
	s := string(base62.FormatInt(id))
	if len(s) >= 6 {
		return s
	}
	return strings.Repeat("A", 6-len(s)) + s
}

func DecodeID(encoded string) (int64, error) {
	trimmed := strings.TrimLeft(encoded, "A")
	if trimmed == "" {
		trimmed = "A" // in case id = 0
	}
	return base62.ParseInt([]byte(trimmed))
}
