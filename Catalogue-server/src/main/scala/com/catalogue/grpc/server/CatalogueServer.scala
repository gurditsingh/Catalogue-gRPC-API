package com.catalogue.grpc.server

import com.catalogue.grpc.service.{CatalogueService, HeaderServerInterceptor}
import com.catalogue.grpc.utils.PropertyLoader
import io.grpc.{Server, ServerBuilder, ServerInterceptors}
import org.apache.log4j.Logger

object CatalogueServer {

  val LOG = Logger.getLogger(CatalogueServer.getClass.getName)
  var server: Server = null


  def main(args: Array[String]): Unit = {
    try{
      CatalogueServer.start()
    }
    catch {
      case e:Exception => throw new RuntimeException(e)
    }
  }

  private def start(): Unit = {

    val config = PropertyLoader.loadAndGet("configuration.properties")
    val catalogueService = new CatalogueService(config("redisHost"), config("redisPort").toInt,config("apiVersion"))

    val serviceDef = ServerInterceptors.
      interceptForward(catalogueService, new HeaderServerInterceptor)


    server = ServerBuilder.forPort(config("servicePort").toInt)
      .addService(serviceDef)
      .build()
      .start()

    LOG.info("gRPC Server Listening from port :" + config("servicePort").toInt)

    Runtime.getRuntime.addShutdownHook(new Thread() {
      override def run(): Unit = {
        System.out.println("Shutdown the server")
        LOG.info("gRPC Shutdown the server :" + config("servicePort").toInt)
        CatalogueServer.stop()
      }
    })

    server.awaitTermination()
  }

  private def stop(): Unit = {
    server.shutdown()
  }

}
