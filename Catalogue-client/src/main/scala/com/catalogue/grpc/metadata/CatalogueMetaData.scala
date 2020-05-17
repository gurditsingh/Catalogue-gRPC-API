package com.catalogue.grpc.metadata

import java.util.concurrent.Executor

import io.grpc._

class CatalogueMetaData(metaData:Map[String,String]) extends CallCredentials{

  override def applyRequestMetadata(requestInfo: CallCredentials.RequestInfo,
                                    appExecutor: Executor, applier: CallCredentials.MetadataApplier): Unit = {
    appExecutor.execute(new Runnable {
      override def run(): Unit = {

        val header=new Metadata()

        metaData.foreach(v =>{
          val key=Metadata.Key.of(v._1,Metadata.ASCII_STRING_MARSHALLER)
          header.put(key,v._2)
        })

        applier.apply(header)
      }
    })
  }

  override def thisUsesUnstableApi(): Unit = {}
}
