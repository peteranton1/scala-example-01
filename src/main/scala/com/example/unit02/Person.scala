package com.example.unit02

class Person(val name: String, val age: Int) {
  override def toString = s"$name, age=$age"
}
object Person {
  def main(args:Array[String]):Unit = {
    val p1 = new Person("Bob",34)
    val p2 = new Person("Mary",34)
    val son1 = apply("Son1",p1,p2)
    val son2 = Person("Son2",p1,p2)
    println(p1)
    println(p2)
    println(son1)
    println(son2)
  }
  def apply(relation:String, p1:Person,p2:Person):Person = {
    val name = s"$relation of ${p1.name} and ${p2.name}"
    val age = 0
    new Person(name, age)
  }
}