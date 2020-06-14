package com.example.unit01

class Person(name: String, age: Int = 0) {
  def presentYourself() = s"Person: $name, $age"
}
class Teacher(name:String) extends Person(name) {
  override def presentYourself() = s"Teacher: $name"
}
class Student(name:String, age: Int = 18, id: Int = 10) extends Person(name) {
  override def presentYourself() = s"Student: $name, $age, id:$id|"
}
object Person extends App {
  val martin = new Person("Martin")
  val bob = new Teacher("Mr Bob")
  val tim = new Student("Tim")
  println(martin.presentYourself())
  println(bob.presentYourself())
  println(tim.presentYourself())
}
