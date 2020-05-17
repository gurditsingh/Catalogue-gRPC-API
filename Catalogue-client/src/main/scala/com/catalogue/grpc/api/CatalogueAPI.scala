package com.catalogue.grpc.api

import com.catalogue.grpc.metadata.CatalogueMetaData
import com.catalogue.grpc.parse.CommandParsing
import com.catalogue.grpc.proto.code.CatalogueOuterClass.Catalogue
import com.catalogue.grpc.proto.code.{CatalogueOuterClass, CatalogueServiceGrpc}
import io.grpc.ManagedChannelBuilder
import org.apache.log4j.Logger

import scala.collection.JavaConverters.iterableAsScalaIterableConverter

object CatalogueAPI {

  val LOG = Logger.getLogger(CatalogueAPI.getClass.getName)

  def createStub(metaData:Map[String,String]): CatalogueServiceGrpc.CatalogueServiceBlockingStub ={

    val channel=ManagedChannelBuilder.forAddress("localhost",8586).usePlaintext().build()
    CatalogueServiceGrpc.newBlockingStub(channel).withCallCredentials(new CatalogueMetaData(metaData))

  }

  def createCatalogue(api:String,catalog:Catalogue): Unit ={

    val stub= createStub(Map("create"->"api_V1"))

    val request=CatalogueOuterClass.CreateRequest.newBuilder()
      .setApi(api)
      .setCatalog(catalog)
        .build()

    val response=stub.create(request)

    LOG.info("Catalogue created with the ID : "+response.getId)

  }

  def readCatalogue(api:String,id:Long): Unit ={

    val stub= createStub(Map("read"->"api_V1"))

    val request=CatalogueOuterClass.ReadRequest.newBuilder()
      .setApi(api)
      .setId(id)
      .build()

    val response=stub.read(request)

    LOG.info("Catalogue read : "+response.toString)
  }

  def updateCatalogue(api:String,catalog:Catalogue): Unit ={

    val stub= createStub(Map("update"->"api_V1"))

    val request=CatalogueOuterClass.UpdateRequest.newBuilder()
      .setApi(api)
      .setCatalog(catalog)
      .build()

    val response=stub.update(request)

    LOG.info("Catalogue Updated status: "+response.getUpdated)
  }

  def deleteCatalogue(api:String,id:Long): Unit ={

    val stub= createStub(Map("delete"->"api_V1"))

    val request=CatalogueOuterClass.DeleteRequest.newBuilder()
      .setApi(api)
      .setId(id)
      .build()

    val response=stub.delete(request)

    LOG.info("Catalogue Deleted status: "+response.getDeleted)
  }

  def readAllCatalogue(api:String): Unit ={

    val stub= createStub(Map("readAll"->"api_V1"))

    val request=CatalogueOuterClass.ReadAllRequest.newBuilder()
      .setApi(api)
      .build()

    val response=stub.readAll(request)

    response.getCatalogList.asScala.foreach(c=>println(c.toString))
  }


}
