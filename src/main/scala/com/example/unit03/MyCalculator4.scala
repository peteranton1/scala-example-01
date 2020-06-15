package com.example.unit03

class MyCalculator4 {
  def multiply1(s: String, n: Int): Int = s.length * n

  val multiply2: (String, Int) => Int = (s, n) => s.length * n

  def toDouble1(n: Int): Double = n.toDouble

  val toDouble2: Int => Double = n => n.toDouble

  def concat1(s1: String, s2: String): String = s1 + s2

  val concat2: (String, String) => String = (s1, s2) => s1 + s2

  def inverseConcat1(s1: String, s2: String): String = s2 + s1

  val inverseConcat2: (String, String) => String = (s1, s2) => s2 + s1

  def myLongFunc1(s: String):String = {
    val length = s.length
    s.reverse * length
  }

  val myLongFunc2: String => String = (s: String) => {
    val length = s.length
    s.reverse * length
  }
}

object MyCalculator4 extends App {
  val app1 = new MyCalculator4()
  println("multiply1(\"ABC\",4) = " + app1.multiply1("ABC", 4))
  println("toDouble1(4) = " + app1.toDouble1(4))
  println("concat1(\"ABC\",\"DEF\") = " + app1.concat1("ABC", "DEF"))
  println("inverseConcat1(\"ABC\",\"DEF\") = " + app1.inverseConcat1("ABC", "DEF"))
  println("myLongFunc1(\"ABC\") = " + app1.myLongFunc1("ABC"))

  println("multiply2(\"ABC\",4) = " + app1.multiply2("ABC", 4))
  println("toDouble1(4) = " + app1.toDouble2(4))
  println("concat1(\"ABC\",\"DEF\") = " + app1.concat2("ABC", "DEF"))
  println("inverseConcat1(\"ABC\",\"DEF\") = " + app1.inverseConcat2("ABC", "DEF"))
  println("myLongFunc1(\"ABC\") = " + app1.myLongFunc2("ABC"))
}
