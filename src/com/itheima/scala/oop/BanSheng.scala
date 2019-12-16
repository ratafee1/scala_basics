package com.itheima.scala.oop

object BanSheng {
  abstract class Person55{
    def sayHello()
  }


  class Person44
  class Student44 extends Person44

  class Person33
  class Student33 extends Person33
  class Persona{
    var name:String=_
    def getName()=this.name
  }
  class Student extends Persona
  object Studen1 extends Persona

  class Person2(var name:String,var age:Int){

  }
  object Person2{
    def apply(name: String, age: Int): Person2 = new Person2(name, age)
  }
  class Person(private/*[this]*/ var name:String){

  }
  object Person{
    def printPerson(p:Person) = println(p.name)

  }
  class CustomeService{
    def save(): Unit ={
      println(CustomeService.SERVICE_NAME + ":save customer")
    }
  }
  object CustomeService{
    private val SERVICE_NAME = "Customer_Service"
  }

  def main(args: Array[String]): Unit = {

    val person55 = new Person55 {
      override def sayHello(): Unit = println("hello")
    }
    person55.sayHello()


//    val p:Person44 = new Student44
//    println(p.isInstanceOf[Student44])
//
//    println(p.getClass == classOf[Person44])
//    println(p.getClass == classOf[Student44])
//
//
//    val s1:Person33 = new Student33
//    if(s1.isInstanceOf[Student33]){
//      val s2 = s1.asInstanceOf[Student33]
//      println(s2)
//    }
//    Studen1.name="zhangsan"
//    println(Studen1.getName())
//    val student = new Student
//    println(student.name)
//    val zhangsan = Person2("zhangsan",20)
//    println(zhangsan.name+zhangsan.age)
//    Person.printPerson(new Person(name = "zhangsan"))
//    val service = new CustomeService
//    service.save()
  }
}
