package com.example.unit02

class Dog(val name:String) extends Animal with Nameable {
  override def eat(food: String): String = s"$food $food"

  override def move(x: Int, y: Int): String = "let's go to ($x,$y)!"
}
