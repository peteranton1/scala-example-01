package com.example.unit4.ch24

object Hello4 {
  case class Person(name:String, age: Int)

  def welcome(person: Person):String = person match {
    case Person("Tom", _) => "Hello Mr Tom!"
    case Person(name, age) if age > 18 => s"Good to see you $name"
    case p @ Person(_,18) => s"${p.name} you look older!"
    case Person(_,_) => "Hi Bro!"
  }

  def main(args:Array[String]):Unit ={
    val p1 = Person("Tom", 12)
    val p2 = Person("Dick", 21)
    val p3 = Person("Harry", 18)
    val p4 = Person("Mary", 14)
    println(welcome(p1))
    println(welcome(p2))
    println(welcome(p3))
    println(welcome(p4))
  }
}
