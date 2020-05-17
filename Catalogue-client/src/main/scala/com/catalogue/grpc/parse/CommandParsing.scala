package com.catalogue.grpc.parse

import org.apache.commons.cli.{CommandLine, CommandLineParser, DefaultParser, HelpFormatter, Option, Options}
import org.apache.log4j.Logger

class CommandParsing {

  val LOG = Logger.getLogger(classOf[CommandParsing])

  def parse(args:Array[String]): CommandLine ={
    val options=new Options

    val method=new Option("m", "method", true, "which method to call for operation \"create,read,update,delete,readAll\" ")
    method.setRequired(true)
    options.addOption(method)

    val id=new Option("i","id",true,"id value to store into Catalogue")
    id.setRequired(true)
    options.addOption(id)

    val title=new Option("t","title",true,"title value to store into Catalogue")
    title.setRequired(false)
    options.addOption(title)

    val desc=new Option("d","desc",true,"description value to store into Catalogue")
    desc.setRequired(false)
    options.addOption(desc)

    val api=new Option("a","api",true,"api id value for validation")
    api.setRequired(false)
    options.addOption(api)

    val parser:CommandLineParser = new DefaultParser
    val formatter:HelpFormatter = new HelpFormatter
    val cmd = null

    try{
      parser.parse(options,args)
    }
    catch {
      case e:Exception =>
        LOG.error(e.getMessage)
        formatter.printHelp("utility-name", options)
        System.exit(1)
        null
    }

  }

}
