package com.example.unit03

class MyCalculator2 {
  val sum = {(a: Int, b: Int) => a + b}
  val subtract = {(a: Int, b: Int)=> a - b}
  val multiply: (Int, Int) => Int = { (a: Int, b: Int) => a * b }
  val divide = { (a: Int, b: Int) => a / b }
  val negate = { (a: Int) => subtract(0, a) }
}
object MyCalculator2 extends App {
  val app1 = new MyCalculator2()
  println("")
  println("sum(3, 5) = "+app1.sum(3, 5))
  println("subtract(4, 4) = "+app1.subtract(4, 4))
  println("multiply(5, 3) = "+app1.multiply(5, 3))
  println("divide(6, 2) = "+app1.divide(6, 2))
  println("negate(-5) = "+app1.negate(-5))
}
