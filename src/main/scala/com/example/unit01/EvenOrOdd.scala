package com.example.unit01

case class EvenOrOdd() {
  def evenOrOdd(n:Int): String =
    if(n % 2 == 0) s"$n is even "
    else s"$n is odd "

  def isEven(n:Int): Boolean = n%2 == 0
  def pow(exponent: Int, base: Int = 2) =
    Math.pow(base,exponent)
}
object EvenOrOdd extends App {
  val app = EvenOrOdd()
  for(i <- 1 to 5) {
    println(app.evenOrOdd(i) + app.isEven(i))
    println(s"2 ^ $i = " + app.pow(i))
  }
}
