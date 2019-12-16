package com.itheima.scala.trait_demo

object trait_template {
  trait Logger{
    def log(msg:String)

    def info(msg:String) = log("info+" + msg)
    def warn(msg:String) = log("warn"+msg)
    def err(msg:String)=log("err"+msg)
  }

  class ConsoleLogger extends Logger{
    override def log(msg: String): Unit = print(msg)
  }

  def main(args: Array[String]): Unit = {
    val  logger = new ConsoleLogger
    logger.info("helllo")
  }
}
