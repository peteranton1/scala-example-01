package com.example.unit4

class ForComp2 {
  def foo(optA: Option[Int]): Option[Int] =
    for {
      a <- optA
      b <- f(a)
      c <- Some(5 * b)
    } yield c

  def f(n: Int): Option[Int] =
    if (n < 5) Some(n * 2)
    else None
}
object ForComp2 extends App {
  val app1 = new ForComp2
  println(app1.foo(Some(1)))
  println(app1.foo(Some(4)))
  println(app1.foo(Some(5)))
  println(app1.foo(None))
}
