package com.example.unit02

trait Animal {
  def sleep = "ZzZ"

  def eat(food: String): String

  def move(x: Int, y: Int): String
}
