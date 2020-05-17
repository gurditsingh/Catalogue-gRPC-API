package com.catalogue.grpc.proto.code;

import io.grpc.stub.ClientCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: catalogue.proto")
public final class CatalogueServiceGrpc {

  private CatalogueServiceGrpc() {}

  public static final String SERVICE_NAME = "CatalogueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest.class,
      responseType = com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse> getCreateMethod;
    if ((getCreateMethod = CatalogueServiceGrpc.getCreateMethod) == null) {
      synchronized (CatalogueServiceGrpc.class) {
        if ((getCreateMethod = CatalogueServiceGrpc.getCreateMethod) == null) {
          CatalogueServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogueServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest.class,
      responseType = com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse> getReadMethod;
    if ((getReadMethod = CatalogueServiceGrpc.getReadMethod) == null) {
      synchronized (CatalogueServiceGrpc.class) {
        if ((getReadMethod = CatalogueServiceGrpc.getReadMethod) == null) {
          CatalogueServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogueServiceMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest.class,
      responseType = com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = CatalogueServiceGrpc.getUpdateMethod) == null) {
      synchronized (CatalogueServiceGrpc.class) {
        if ((getUpdateMethod = CatalogueServiceGrpc.getUpdateMethod) == null) {
          CatalogueServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogueServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest.class,
      responseType = com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = CatalogueServiceGrpc.getDeleteMethod) == null) {
      synchronized (CatalogueServiceGrpc.class) {
        if ((getDeleteMethod = CatalogueServiceGrpc.getDeleteMethod) == null) {
          CatalogueServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogueServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse> getReadAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadAll",
      requestType = com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest.class,
      responseType = com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest,
      com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse> getReadAllMethod;
    if ((getReadAllMethod = CatalogueServiceGrpc.getReadAllMethod) == null) {
      synchronized (CatalogueServiceGrpc.class) {
        if ((getReadAllMethod = CatalogueServiceGrpc.getReadAllMethod) == null) {
          CatalogueServiceGrpc.getReadAllMethod = getReadAllMethod =
              io.grpc.MethodDescriptor.<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest, com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CatalogueServiceMethodDescriptorSupplier("ReadAll"))
              .build();
        }
      }
    }
    return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CatalogueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CatalogueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CatalogueServiceStub>() {
        @Override
        public CatalogueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CatalogueServiceStub(channel, callOptions);
        }
      };
    return CatalogueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CatalogueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CatalogueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CatalogueServiceBlockingStub>() {
        @Override
        public CatalogueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CatalogueServiceBlockingStub(channel, callOptions);
        }
      };
    return CatalogueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CatalogueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CatalogueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CatalogueServiceFutureStub>() {
        @Override
        public CatalogueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CatalogueServiceFutureStub(channel, callOptions);
        }
      };
    return CatalogueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CatalogueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void read(com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void update(com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void readAll(com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest,
                com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest,
                com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest,
                com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest,
                com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest,
                com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class CatalogueServiceStub extends io.grpc.stub.AbstractAsyncStub<CatalogueServiceStub> {
    private CatalogueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CatalogueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CatalogueServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest request,
        io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CatalogueServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CatalogueServiceBlockingStub> {
    private CatalogueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CatalogueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CatalogueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse create(com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse read(com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse update(com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse delete(com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse readAll(com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CatalogueServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CatalogueServiceFutureStub> {
    private CatalogueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CatalogueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CatalogueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse> create(
        com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse> read(
        com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse> update(
        com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse> delete(
        com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse> readAll(
        com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_READ = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_READ_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatalogueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CatalogueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.CreateResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadRequest) request,
              (io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.DeleteResponse>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllRequest) request,
              (io.grpc.stub.StreamObserver<com.catalogue.grpc.proto.code.CatalogueOuterClass.ReadAllResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CatalogueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CatalogueServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.catalogue.grpc.proto.code.CatalogueOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CatalogueService");
    }
  }

  private static final class CatalogueServiceFileDescriptorSupplier
      extends CatalogueServiceBaseDescriptorSupplier {
    CatalogueServiceFileDescriptorSupplier() {}
  }

  private static final class CatalogueServiceMethodDescriptorSupplier
      extends CatalogueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CatalogueServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CatalogueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CatalogueServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getReadMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
