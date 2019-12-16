package com.itheima.scala.oop

import java.text.SimpleDateFormat
import java.util.Date

object _01ClassObject {

//  object DateUtils {
//    // 在object中定义的成员变量，相当于Java中定义一个静态变量
//    // 定义一个SimpleDateFormat日期时间格式化对象
//    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
//
//    // 相当于Java中定义一个静态方法
//    def format(date: Date) = simpleDateFormat.format(date)
//  }

    object DateUtil{
     val format1 = new SimpleDateFormat("yyyy-MM-dd")
    def format(date:Date) = format1.format(date)
  }

  object PrintUtil{
    def printSpliter()={
      println("-"*15)
    }

  }

  object Dog{
    val LEG_NUM = 4

  }

  class Customer(var name:String="", var address:String = ""){
//    辅助构造器
    def this(data:Array[String]){
      this(data(0),data(1))
    }
  }

  class Person5(var name:String = "",var age:Int = 0){
    println("diaoyong")
  }

  class Person4{
    private var name = ""
    private var age = 0
    def getName()= this.name
    def setName(name:String)=this.name = name
    def getAge() = this.age
    def setAge(age:Int) = this.age = age

    private def getNameandAge()= (this.name,this.age)
  }
  class Cumtomer{
    var name:String = _
    var sex:String = _

    def sayHi(msg:String)={
      println(msg)
    }
  }
  class  Person3{
    var name:String = _
    var age:Int = _
  }
  class Person2{
    var name:String = ""
    var age:Int = 0
  }
  class Person1
  class Person{

  }

  def main(args: Array[String]): Unit = {

//    println(DateUtils.format(new Date()))

    println(DateUtil.format(new Date()))

//    PrintUtil.printSpliter()
//    println(Dog.LEG_NUM)
//    val customer = new Customer(Array("zhangsan","beijing"))
//    println(customer.name)
//    println(customer.address)

//    val person5 = new Person5("zhangsan",20)
//    println(person5.name)
//    println(person5.age)
//    println("---")
//  var empty = new Person5


//    var person4  = new Person4
//    val cumtomer = new Cumtomer
//    cumtomer.sayHi("hh")
//  -------------------------------------------------------------------------------
//    var person3 = new Person3
//    person3.name = "lisi"
//    person3.age = 20
//    println(person3.name + person3.age)
//
//    val person = new Person()
//    println(person)
//
//    val person1 = new Person1
//    println(person1)
//
//    val person2 = new Person2
//    person2.name= "zhangsan"
//    person2.age = 20
//    println(person2.name +" " + person2.age)
  }

}
