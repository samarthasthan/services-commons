package com.samarthasthan.profile.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: profile/v1/profile.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProfileServiceGrpc {

  private ProfileServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "profile.v1.ProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.samarthasthan.profile.v1.CreateProfileRequest,
      com.samarthasthan.profile.v1.CreateProfileResponse> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProfile",
      requestType = com.samarthasthan.profile.v1.CreateProfileRequest.class,
      responseType = com.samarthasthan.profile.v1.CreateProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samarthasthan.profile.v1.CreateProfileRequest,
      com.samarthasthan.profile.v1.CreateProfileResponse> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<com.samarthasthan.profile.v1.CreateProfileRequest, com.samarthasthan.profile.v1.CreateProfileResponse> getCreateProfileMethod;
    if ((getCreateProfileMethod = ProfileServiceGrpc.getCreateProfileMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getCreateProfileMethod = ProfileServiceGrpc.getCreateProfileMethod) == null) {
          ProfileServiceGrpc.getCreateProfileMethod = getCreateProfileMethod =
              io.grpc.MethodDescriptor.<com.samarthasthan.profile.v1.CreateProfileRequest, com.samarthasthan.profile.v1.CreateProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.profile.v1.CreateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.profile.v1.CreateProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("CreateProfile"))
              .build();
        }
      }
    }
    return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.samarthasthan.profile.v1.GetProfileRequest,
      com.samarthasthan.profile.v1.GetProfileResponse> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = com.samarthasthan.profile.v1.GetProfileRequest.class,
      responseType = com.samarthasthan.profile.v1.GetProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.samarthasthan.profile.v1.GetProfileRequest,
      com.samarthasthan.profile.v1.GetProfileResponse> getGetProfileMethod() {
    io.grpc.MethodDescriptor<com.samarthasthan.profile.v1.GetProfileRequest, com.samarthasthan.profile.v1.GetProfileResponse> getGetProfileMethod;
    if ((getGetProfileMethod = ProfileServiceGrpc.getGetProfileMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getGetProfileMethod = ProfileServiceGrpc.getGetProfileMethod) == null) {
          ProfileServiceGrpc.getGetProfileMethod = getGetProfileMethod =
              io.grpc.MethodDescriptor.<com.samarthasthan.profile.v1.GetProfileRequest, com.samarthasthan.profile.v1.GetProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.profile.v1.GetProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.samarthasthan.profile.v1.GetProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("GetProfile"))
              .build();
        }
      }
    }
    return getGetProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceStub>() {
        @java.lang.Override
        public ProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceStub(channel, callOptions);
        }
      };
    return ProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProfileServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProfileServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProfileServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceBlockingStub>() {
        @java.lang.Override
        public ProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return ProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceFutureStub>() {
        @java.lang.Override
        public ProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceFutureStub(channel, callOptions);
        }
      };
    return ProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createProfile(com.samarthasthan.profile.v1.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.profile.v1.CreateProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    default void getProfile(com.samarthasthan.profile.v1.GetProfileRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.profile.v1.GetProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProfileService.
   */
  public static abstract class ProfileServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProfileServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProfileService.
   */
  public static final class ProfileServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProfileServiceStub> {
    private ProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProfile(com.samarthasthan.profile.v1.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.profile.v1.CreateProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfile(com.samarthasthan.profile.v1.GetProfileRequest request,
        io.grpc.stub.StreamObserver<com.samarthasthan.profile.v1.GetProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProfileService.
   */
  public static final class ProfileServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProfileServiceBlockingV2Stub> {
    private ProfileServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.samarthasthan.profile.v1.CreateProfileResponse createProfile(com.samarthasthan.profile.v1.CreateProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.profile.v1.GetProfileResponse getProfile(com.samarthasthan.profile.v1.GetProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProfileService.
   */
  public static final class ProfileServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProfileServiceBlockingStub> {
    private ProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.samarthasthan.profile.v1.CreateProfileResponse createProfile(com.samarthasthan.profile.v1.CreateProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.samarthasthan.profile.v1.GetProfileResponse getProfile(com.samarthasthan.profile.v1.GetProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProfileService.
   */
  public static final class ProfileServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProfileServiceFutureStub> {
    private ProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samarthasthan.profile.v1.CreateProfileResponse> createProfile(
        com.samarthasthan.profile.v1.CreateProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.samarthasthan.profile.v1.GetProfileResponse> getProfile(
        com.samarthasthan.profile.v1.GetProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROFILE = 0;
  private static final int METHODID_GET_PROFILE = 1;

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
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((com.samarthasthan.profile.v1.CreateProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.samarthasthan.profile.v1.CreateProfileResponse>) responseObserver);
          break;
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((com.samarthasthan.profile.v1.GetProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.samarthasthan.profile.v1.GetProfileResponse>) responseObserver);
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
          getCreateProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samarthasthan.profile.v1.CreateProfileRequest,
              com.samarthasthan.profile.v1.CreateProfileResponse>(
                service, METHODID_CREATE_PROFILE)))
        .addMethod(
          getGetProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.samarthasthan.profile.v1.GetProfileRequest,
              com.samarthasthan.profile.v1.GetProfileResponse>(
                service, METHODID_GET_PROFILE)))
        .build();
  }

  private static abstract class ProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.samarthasthan.profile.v1.ProfileProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfileService");
    }
  }

  private static final class ProfileServiceFileDescriptorSupplier
      extends ProfileServiceBaseDescriptorSupplier {
    ProfileServiceFileDescriptorSupplier() {}
  }

  private static final class ProfileServiceMethodDescriptorSupplier
      extends ProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProfileServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfileServiceFileDescriptorSupplier())
              .addMethod(getCreateProfileMethod())
              .addMethod(getGetProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
