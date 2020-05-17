package com.catalogue.grpc.utils

import java.io.FileReader
import java.util.Properties

import org.apache.log4j.Logger

import scala.collection.JavaConversions._

object PropertyLoader {

  val LOG = Logger.getLogger(PropertyLoader.getClass.getName)

  def loadAndGet(fileName: String): Map[String, String] = {
    try {
      val prop = new Properties()
      if (System.getProperty(fileName) == null)
        prop.load(ClassLoader.getSystemResourceAsStream(fileName))
      else
        prop.load(new FileReader(fileName))

      prop.keysIterator.map(key=> (key,prop.getProperty(key))).toMap
    }
    catch {
      case e: Exception => {
        LOG.error("Error while loading the properties form: " + fileName)
        throw new RuntimeException(e)
      }
    }

  }

}
