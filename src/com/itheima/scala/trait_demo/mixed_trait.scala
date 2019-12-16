package com.itheima.scala.trait_demo
//
//object mixed_trait {
//  trait Logger{
//    def log(msg:String)=println(msg)
//  }
//  class UserService
//
//  def main(args: Array[String]): Unit = {
//    val service = new UserService with Logger
//    service.log("hello")
//  }
//}
object mixed_trait {


  trait Logger {
    println("执行Logger构造器")
  }

  trait MyLogger extends Logger {
    println("执行MyLogger构造器")
  }

  trait TimeLogger extends Logger {
    println("执行TimeLogger构造器")
  }

  class Person{
    println("执行Person构造器")
  }

  class Student extends Person with TimeLogger with MyLogger {
    println("执行Student构造器")
  }

  def main(args: Array[String]): Unit = {
    new Student
  }


//  class MyUtil {
//    def printMsg(msg:String) = println(msg)
//  }
//
//  trait Logger extends MyUtil {
//    def log(msg:String) = printMsg("Logger:" + msg)
//  }
//
//  class Person extends Logger {
//    def sayHello() = log("你好")
//  }
//
//  def main(args: Array[String]): Unit = {
//    val person = new Person
//    person.sayHello()
//  }
//
//  trait HandlerTrait {
//    def handle(data: String) = println("处理数据...")
//  }
//
//  trait DataValidHanlderTrait extends HandlerTrait {
//    override def handle(data: String): Unit = {
//      println("验证数据...")
//      super.handle(data)
//    }
//  }
//
//  trait SignatureValidHandlerTrait extends HandlerTrait {
//    override def handle(data: String): Unit = {
//      println("校验签名...")
//      super.handle(data)
//    }
//  }
//
//  class PayService extends DataValidHanlderTrait with SignatureValidHandlerTrait {
//    override def handle(data: String): Unit = {
//      println("准备支付...")
//      super.handle(data)
//    }
//  }
//
//  def main(args: Array[String]): Unit = {
//    val service = new PayService
//    service.handle("支付参数")
//  }

  // 程序运行输出如下：
  // 准备支付...
  // 检查签名...
  // 验证数据...
  // 处理数据...
}