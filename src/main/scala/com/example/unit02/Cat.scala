package com.example.unit02

class Cat extends Animal {
  override def sleep: String = super.sleep

  override def eat(food: String): String = s"the cat is eating $food"

  override def move(x: Int, y: Int): String = s"the cat is moving to ($x,$y)"
}
