package com.example.unit4

class SqrtOption {
  def sqrt(n: Int): Option[Double] =
    if(n >= 0) Some(Math.sqrt(n)) else None

  def sqrtOrZero(n: Int): Double =
    sqrt(n) match {
      case Some(result) => result
      case None => 0.0
    }
}
object SqrtOption extends App {
  val app1 = new SqrtOption
  println(app1.sqrt(5))
  println(app1.sqrt(0))
  println(app1.sqrt(-5))
  println(app1.sqrtOrZero(5))
  println(app1.sqrtOrZero(0))
  println(app1.sqrtOrZero(-5))
}
