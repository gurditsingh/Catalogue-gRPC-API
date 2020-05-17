package com.catalogue.grpc.client

import com.catalogue.grpc.api.CatalogueAPI
import com.catalogue.grpc.parse.CommandParsing
import com.catalogue.grpc.proto.code.CatalogueOuterClass.Catalogue
import org.apache.commons.cli.CommandLine

object CatalogueClient {


  def createMethod(cmd:CommandLine): Unit ={
    val api=cmd.getOptionValue("api")

    val id=cmd.getOptionValue("id")
    val title=cmd.getOptionValue("title")
    val desc=cmd.getOptionValue("desc")

    val catalogue=Catalogue.newBuilder()
      .setId(id.toLong)
      .setTitle(title)
      .setDescription(desc)
      .build()

    CatalogueAPI.createCatalogue(api,catalogue)
  }

  def readMethod(cmd:CommandLine): Unit ={
    val id=cmd.getOptionValue("id")
    val api=cmd.getOptionValue("api")

    CatalogueAPI.readCatalogue(api,id.toLong)
  }

  def updateMethod(cmd:CommandLine): Unit ={
    val api=cmd.getOptionValue("api")

    val id=cmd.getOptionValue("id")
    val title=cmd.getOptionValue("title")
    val desc=cmd.getOptionValue("desc")

    val catalogue=Catalogue.newBuilder()
      .setId(id.toLong)
      .setTitle(title)
      .setDescription(desc)
      .build()

    CatalogueAPI.updateCatalogue(api,catalogue)
  }

  def deleteMethod(cmd:CommandLine): Unit ={
    val id=cmd.getOptionValue("id")
    val api=cmd.getOptionValue("api")

    CatalogueAPI.deleteCatalogue(api,id.toLong)
  }

  def readAllMethod(cmd:CommandLine): Unit ={
    val id=cmd.getOptionValue("id")
    val api=cmd.getOptionValue("api")

    CatalogueAPI.readAllCatalogue(api)
  }

  def methodCalling(args:Array[String]): Unit ={
    val cmd=new CommandParsing().parse(args)

    val methodName=cmd.getOptionValue("method")

    methodName match {
      case "create" =>  createMethod(cmd)
      case "read" => readMethod(cmd)
      case "update" => updateMethod(cmd)
      case "delete" => deleteMethod(cmd)
      case "readAll" => readAllMethod(cmd)
    }
  }

  def main(args: Array[String]): Unit = {
    methodCalling(args)
  }

}
