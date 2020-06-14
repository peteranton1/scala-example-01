package com.example.unit01

abstract class Robot(val name: String = "Unknown") {
  def welcome(n: String): String
  def hello(): String
}

class ItalianRobot(name: String) extends Robot(name) {
  override def welcome(n: String) = s"Benvenuto $n! My name is $name"
  override def hello(): String = name
}

class EnglishRobot(name: String, country: String) extends Robot(name) {
  override def welcome(n: String) = s"Welcome $n! My name is $name, from country $country"
  override def hello(): String = name
}

object Robot extends App {
  val tom = new ItalianRobot("Tom")
  val john = new EnglishRobot("John", country = "UK")
  val robot1 = new EnglishRobot(country = "Robot", name = "Unk")

  println(tom.welcome("Ted") + tom.hello())
  println(john.welcome("Ted") + john.hello())
  println(robot1.welcome("Ted") + robot1.hello())
}
