package com.example.unit03

class MyCalculator3 {
  val sum: (Int, Int) => Int = _ + _
  val subtract: (Int, Int) => Int = _ - _
  val multiply: (Int, Int) => Int = _ * _
  val divide: (Int, Int) => Int = _ / _
  val negate: Int => Int = subtract(0, _)
}

object MyCalculator3 extends App {
  val app1 = new MyCalculator3()
  println("")
  println("sum(3, 5) = " + app1.sum(3, 5))
  println("subtract(4, 4) = " + app1.subtract(4, 4))
  println("multiply(5, 3) = " + app1.multiply(5, 3))
  println("divide(6, 2) = " + app1.divide(6, 2))
  println("negate(-5) = " + app1.negate(-5))
}