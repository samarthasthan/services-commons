package com.samarthasthan.auth.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: auth/v1/auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "auth.v1.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.GenerateTokenRequest,
      com.samarthasthan.auth.v1.GenerateTokenResponse> getGenerateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateToken",
      requestType = com.samarthasthan.auth.v1.GenerateTokenRequest.class,
      responseType = com.samarthasthan.auth.v1.GenerateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.GenerateTokenRequest,
      com.samarthasthan.auth.v1.GenerateTokenResponse> getGenerateTokenMethod() {
    io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.GenerateTokenRequest, com.samarthasthan.auth.v1.GenerateTokenResponse> getGenerateTokenMethod;
    if ((getGenerateTokenMethod = AuthServiceGrpc.getGenerateTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGenerateTokenMethod = AuthServiceGrpc.getGenerateTokenMethod) == null) {
          AuthServiceGrpc.getGenerateTokenMethod = getGenerateTokenMethod =
              io.grpc.MethodDescriptor.<com.samarthasthan.auth.v1.GenerateTokenRequest, com.samarthasthan.auth.v1.GenerateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.GenerateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.GenerateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GenerateToken"))
              .build();
        }
      }
    }
    return getGenerateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.ValidateTokenRequest,
      com.samarthasthan.auth.v1.ValidateTokenResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = com.samarthasthan.auth.v1.ValidateTokenRequest.class,
      responseType = com.samarthasthan.auth.v1.ValidateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.ValidateTokenRequest,
      com.samarthasthan.auth.v1.ValidateTokenResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.ValidateTokenRequest, com.samarthasthan.auth.v1.ValidateTokenResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = AuthServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getValidateTokenMethod = AuthServiceGrpc.getValidateTokenMethod) == null) {
          AuthServiceGrpc.getValidateTokenMethod = getValidateTokenMethod =
              io.grpc.MethodDescriptor.<com.samarthasthan.auth.v1.ValidateTokenRequest, com.samarthasthan.auth.v1.ValidateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.ValidateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ValidateToken"))
              .build();
        }
      }
    }
    return getValidateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.RefreshTokenRequest,
      com.samarthasthan.auth.v1.RefreshTokenResponse> getRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefreshToken",
      requestType = com.samarthasthan.auth.v1.RefreshTokenRequest.class,
      responseType = com.samarthasthan.auth.v1.RefreshTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.RefreshTokenRequest,
      com.samarthasthan.auth.v1.RefreshTokenResponse> getRefreshTokenMethod() {
    io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.RefreshTokenRequest, com.samarthasthan.auth.v1.RefreshTokenResponse> getRefreshTokenMethod;
    if ((getRefreshTokenMethod = AuthServiceGrpc.getRefreshTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRefreshTokenMethod = AuthServiceGrpc.getRefreshTokenMethod) == null) {
          AuthServiceGrpc.getRefreshTokenMethod = getRefreshTokenMethod =
              io.grpc.MethodDescriptor.<com.samarthasthan.auth.v1.RefreshTokenRequest, com.samarthasthan.auth.v1.RefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.RefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.RefreshTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("RefreshToken"))
              .build();
        }
      }
    }
    return getRefreshTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.DeleteTokensRequest,
      com.samarthasthan.auth.v1.DeleteTokensResponse> getDeleteTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTokens",
      requestType = com.samarthasthan.auth.v1.DeleteTokensRequest.class,
      responseType = com.samarthasthan.auth.v1.DeleteTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.DeleteTokensRequest,
      com.samarthasthan.auth.v1.DeleteTokensResponse> getDeleteTokensMethod() {
    io.grpc.MethodDescriptor<com.samarthasthan.auth.v1.DeleteTokensRequest, com.samarthasthan.auth.v1.DeleteTokensResponse> getDeleteTokensMethod;
    if ((getDeleteTokensMethod = AuthServiceGrpc.getDeleteTokensMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteTokensMethod = AuthServiceGrpc.getDeleteTokensMethod) == null) {
          AuthServiceGrpc.getDeleteTokensMethod = getDeleteTokensMethod =
              io.grpc.MethodDescriptor.<com.samarthasthan.auth.v1.DeleteTokensRequest, com.samarthasthan.auth.v1.DeleteTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.DeleteTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.auth.v1.DeleteTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteTokens"))
              .build();
        }
      }
    }
    return getDeleteTokensMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AuthServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingV2Stub>() {
        @java.lang.Override
        public AuthServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AuthServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void generateToken(com.samarthasthan.auth.v1.GenerateTokenRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.GenerateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTokenMethod(), responseObserver);
    }

    /**
     */
    default void validateToken(com.samarthasthan.auth.v1.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }

    /**
     */
    default void refreshToken(com.samarthasthan.auth.v1.RefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.RefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshTokenMethod(), responseObserver);
    }

    /**
     */
    default void deleteTokens(com.samarthasthan.auth.v1.DeleteTokensRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.DeleteTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTokensMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateToken(com.samarthasthan.auth.v1.GenerateTokenRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.GenerateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateToken(com.samarthasthan.auth.v1.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshToken(com.samarthasthan.auth.v1.RefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.RefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTokens(com.samarthasthan.auth.v1.DeleteTokensRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.DeleteTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingV2Stub> {
    private AuthServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.samarthasthan.auth.v1.GenerateTokenResponse generateToken(com.samarthasthan.auth.v1.GenerateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.auth.v1.ValidateTokenResponse validateToken(com.samarthasthan.auth.v1.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.auth.v1.RefreshTokenResponse refreshToken(com.samarthasthan.auth.v1.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.auth.v1.DeleteTokensResponse deleteTokens(com.samarthasthan.auth.v1.DeleteTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.samarthasthan.auth.v1.GenerateTokenResponse generateToken(com.samarthasthan.auth.v1.GenerateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.auth.v1.ValidateTokenResponse validateToken(com.samarthasthan.auth.v1.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.auth.v1.RefreshTokenResponse refreshToken(com.samarthasthan.auth.v1.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.auth.v1.DeleteTokensResponse deleteTokens(com.samarthasthan.auth.v1.DeleteTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samarthasthan.auth.v1.GenerateTokenResponse> generateToken(
        com.samarthasthan.auth.v1.GenerateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samarthasthan.auth.v1.ValidateTokenResponse> validateToken(
        com.samarthasthan.auth.v1.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samarthasthan.auth.v1.RefreshTokenResponse> refreshToken(
        com.samarthasthan.auth.v1.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samarthasthan.auth.v1.DeleteTokensResponse> deleteTokens(
        com.samarthasthan.auth.v1.DeleteTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_TOKEN = 0;
  private static final int METHODID_VALIDATE_TOKEN = 1;
  private static final int METHODID_REFRESH_TOKEN = 2;
  private static final int METHODID_DELETE_TOKENS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_TOKEN:
          serviceImpl.generateToken((com.samarthasthan.auth.v1.GenerateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.GenerateTokenResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((com.samarthasthan.auth.v1.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.ValidateTokenResponse>) responseObserver);
          break;
        case METHODID_REFRESH_TOKEN:
          serviceImpl.refreshToken((com.samarthasthan.auth.v1.RefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.RefreshTokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_TOKENS:
          serviceImpl.deleteTokens((com.samarthasthan.auth.v1.DeleteTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.samarthasthan.auth.v1.DeleteTokensResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGenerateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samarthasthan.auth.v1.GenerateTokenRequest,
              com.samarthasthan.auth.v1.GenerateTokenResponse>(
                service, METHODID_GENERATE_TOKEN)))
        .addMethod(
          getValidateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samarthasthan.auth.v1.ValidateTokenRequest,
              com.samarthasthan.auth.v1.ValidateTokenResponse>(
                service, METHODID_VALIDATE_TOKEN)))
        .addMethod(
          getRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samarthasthan.auth.v1.RefreshTokenRequest,
              com.samarthasthan.auth.v1.RefreshTokenResponse>(
                service, METHODID_REFRESH_TOKEN)))
        .addMethod(
          getDeleteTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samarthasthan.auth.v1.DeleteTokensRequest,
              com.samarthasthan.auth.v1.DeleteTokensResponse>(
                service, METHODID_DELETE_TOKENS)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.samarthasthan.auth.v1.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getGenerateTokenMethod())
              .addMethod(getValidateTokenMethod())
              .addMethod(getRefreshTokenMethod())
              .addMethod(getDeleteTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
