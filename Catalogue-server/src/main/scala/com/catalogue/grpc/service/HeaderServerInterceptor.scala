package com.catalogue.grpc.service

import io.grpc.{Metadata, ServerCall, ServerCallHandler, ServerInterceptor}
import org.apache.log4j.Logger

import scala.collection.JavaConverters.collectionAsScalaIterableConverter

class HeaderServerInterceptor extends ServerInterceptor{

  val LOG=Logger.getLogger(classOf[HeaderServerInterceptor])

  override def interceptCall[ReqT, RespT](call: ServerCall[ReqT, RespT]
                                          , headers: Metadata, next: ServerCallHandler[ReqT, RespT]): ServerCall.Listener[ReqT] = {

    if(call.getMethodDescriptor.getFullMethodName.equalsIgnoreCase("CatalogueService/create")
    || call.getMethodDescriptor.getFullMethodName.equalsIgnoreCase("CatalogueService/read")){
      headers.keys().asScala.foreach(key=>{
        val metadata=key +" : "+ headers.get(Metadata.Key.of(key,Metadata.ASCII_STRING_MARSHALLER))
        LOG.info(metadata)
      })
    }

    next.startCall(call,headers)
  }
}
