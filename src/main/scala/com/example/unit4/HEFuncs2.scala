package com.example.unit4

class HEFuncs2 {
  def foo(n: Int, f: Int => Double = _.toDouble): Double =
    f(n)
}

object HEFuncs2 extends App {
  val app1 = new HEFuncs2
  println("foo(42, n => n + 2.0) = "+app1.foo(42, n => n + 2.0))
  println("foo(42) = "+app1.foo(42))
}