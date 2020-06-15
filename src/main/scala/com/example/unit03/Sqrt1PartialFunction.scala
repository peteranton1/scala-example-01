package com.example.unit03

class Sqrt1PartialFunction {
  val sqrt: PartialFunction[Int, Double] =
  { case x if x >= 0 => Math.sqrt(x)}

  val zero: PartialFunction[Int, Double] = { case _ => 0 }
  val value: PartialFunction[Int, Double] = { case x => x }

  def sqrtOrZero(n: Int): Double = sqrt.orElse(zero)(n)

  def sqrtOrValue(n: Int): Double = sqrt.orElse(value)(n)
}
object Sqrt1PartialFunction extends App {
  val app1 = new Sqrt1PartialFunction()
  println("sqrtOrZero(4) = " + app1.sqrtOrZero(4))
  println("sqrtOrZero(-4) = " + app1.sqrtOrZero(-4))
  println("sqrtOrValue(4) = " + app1.sqrtOrValue(4))
  println("sqrtOrValue(-4) = " + app1.sqrtOrValue(-4))
}
