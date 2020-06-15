package com.example.unit03

class MyCalculator1 {
  def sum(a: Int, b: Int): Int = a + b
  def subtract(a: Int, b: Int): Int = a - b
  def multiply(a: Int, b: Int): Int = a * b
  def divide(a: Int, b: Int): Int = a / b
  def negate(a: Int): Int = subtract(0, a)
}
object MyCalculator1 extends App {
  val app1 = new MyCalculator1()
  println("")
  println("sum(3, 5) = "+app1.sum(3, 5))
  println("subtract(4, 4) = "+app1.subtract(4, 4))
  println("multiply(5, 3) = "+app1.multiply(5, 3))
  println("divide(6, 2) = "+app1.divide(6, 2))
  println("negate(-5) = "+app1.negate(-5))
}
