package com.itheima.scala.trait_demo

object trait_demo {

  trait Logger1{
    def log(msg:String)
  }

  object ConsoleLogger extends Logger1{
    override def log(msg: String): Unit = println(msg +"2343")
  }

  trait MessageSender{
  def send(msg:String)
  }
  trait MessageReceiver{
  def receive():String
  }

  class MessageWorker extends MessageSender with MessageReceiver{
    override def send(msg: String): Unit = println("send ")

    override def receive(): String = "receive"
  }

  trait Logger{
    def log(msg:String)
  }
  class ConsoleLogger extends Logger{
    override def log(msg: String): Unit = println("msg"+msg)
  }

  def main(args: Array[String]): Unit = {
    ConsoleLogger.log("good people")

    val worker = new MessageWorker
    worker.send("hh")
    println(worker.receive())

//    val logger = new ConsoleLogger
//    logger.log("nullpointer exception..")
  }
}
