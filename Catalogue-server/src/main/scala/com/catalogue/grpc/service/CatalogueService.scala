package com.catalogue.grpc.service

import com.catalogue.grpc.proto.code.CatalogueOuterClass.Catalogue
import com.catalogue.grpc.proto.code.{CatalogueOuterClass, CatalogueServiceGrpc}
import io.grpc.stub.StreamObserver
import org.apache.commons.lang3.SerializationUtils
import org.apache.log4j.Logger
import redis.clients.jedis.Jedis

import scala.collection.JavaConverters.asScalaSetConverter

class CatalogueService(host: String, port: Int, apiVersion: String) extends CatalogueServiceGrpc.CatalogueServiceImplBase {

  val LOG = Logger.getLogger(classOf[CatalogueService])

  def connect(): Jedis = {
    new Jedis(host, port)
  }

  def validateAPIVersion[T](responseObserver: StreamObserver[T], api_Ver: String): Unit = {
    if (!apiVersion.equalsIgnoreCase(api_Ver))
      responseObserver.onError(new Exception("unsupported API version : " + api_Ver + ", Server implements API version : " + apiVersion))
  }

  override
  def create(request: CatalogueOuterClass.CreateRequest,
             responseObserver: StreamObserver[CatalogueOuterClass.CreateResponse]): Unit = {

    validateAPIVersion(responseObserver, request.getApi)

    val c_ID = request.getCatalog.getId
    val jedis = connect()

    jedis.set(c_ID.toString.getBytes(), SerializationUtils.serialize(request.getCatalog))

    val response = CatalogueOuterClass.CreateResponse.newBuilder()
      .setApi(request.getApi)
      .setId(c_ID)
      .build()

    responseObserver.onNext(response)
    responseObserver.onCompleted()
    LOG.info("User Creates a new item in Catalog with id : " + c_ID)

  }

  override def read(request: CatalogueOuterClass.ReadRequest,
                    responseObserver: StreamObserver[CatalogueOuterClass.ReadResponse]): Unit = {

    validateAPIVersion(responseObserver, request.getApi)

    val jedis = connect()

    val c_ID = request.getId
    val ser_catalog = jedis.get(c_ID.toString.getBytes())

    val catalog = if (ser_catalog != null) {
      LOG.info("Catalog item return with id : " + c_ID)
      SerializationUtils.deserialize(ser_catalog).asInstanceOf[CatalogueOuterClass.Catalogue]
    }else {
      LOG.info("No Catalog item found for id : " + c_ID +" return Empty Catalog item")
      Catalogue.newBuilder().build()
    }
    val response = CatalogueOuterClass.ReadResponse.newBuilder()
      .setCatalog(catalog)
      .setApi(request.getApi)
      .build()

    responseObserver.onNext(response)
    responseObserver.onCompleted()
  }

  override def update(request: CatalogueOuterClass.UpdateRequest
                      , responseObserver: StreamObserver[CatalogueOuterClass.UpdateResponse]): Unit = {
    validateAPIVersion(responseObserver, request.getApi)

    validateAPIVersion(responseObserver, request.getApi)

    val jedis = connect()

    val c_ID = request.getCatalog.getId
    val ser_catalog = jedis.get(c_ID.toString.getBytes())

    val response =if (ser_catalog != null) {
      LOG.info("Catalog item found with id : " + c_ID+" update the Catalog item")
      jedis.set(c_ID.toString.getBytes(), SerializationUtils.serialize(request.getCatalog))

      CatalogueOuterClass.UpdateResponse.newBuilder()
        .setApi(request.getApi)
        .setUpdated(1)
        .build()

    }else {
      LOG.info("No Catalog item found for id : " + c_ID )
       CatalogueOuterClass.UpdateResponse.newBuilder()
        .setApi(request.getApi)
        .setUpdated(0)
        .build()
    }

    responseObserver.onNext(response)
    responseObserver.onCompleted()

  }

  override def delete(request: CatalogueOuterClass.DeleteRequest
                      , responseObserver: StreamObserver[CatalogueOuterClass.DeleteResponse]): Unit = {
    validateAPIVersion(responseObserver, request.getApi)

    val jedis = connect()

    val c_ID = request.getId
    val ser_catalog = jedis.get(c_ID.toString.getBytes())

    val response =if (ser_catalog != null) {
      LOG.info("Catalog item found with id : " + c_ID+" and Deleted from Catalog")
      jedis.del(c_ID.toString.getBytes())

      CatalogueOuterClass.DeleteResponse.newBuilder()
        .setApi(request.getApi)
        .setDeleted(1)
        .build()

    }else {
      LOG.info("No Catalog item found for id : " + c_ID )
      CatalogueOuterClass.DeleteResponse.newBuilder()
        .setApi(request.getApi)
        .setDeleted(0)
        .build()
    }

    responseObserver.onNext(response)
    responseObserver.onCompleted()

  }

  override def readAll(request: CatalogueOuterClass.ReadAllRequest
                       , responseObserver: StreamObserver[CatalogueOuterClass.ReadAllResponse]): Unit = {

    validateAPIVersion(responseObserver, request.getApi)

    val responseBuilder = CatalogueOuterClass.ReadAllResponse.newBuilder()
      .setApi(request.getApi)

    val jedis = connect()

    val keys = jedis.keys("*")

    keys.asScala.foreach(key=>{
      val catalogue=SerializationUtils.deserialize(jedis.get(key.getBytes())).asInstanceOf[CatalogueOuterClass.Catalogue]
      responseBuilder.addCatalog(catalogue)
    })

    if(keys.isEmpty)
      LOG.info("No item present in Catalog")

    val response=responseBuilder.build()
    responseObserver.onNext(response)
    responseObserver.onCompleted()

  }

}
