package com.example.unit4

class HEFuncs1 {
  def stats(s:String, predicate: Char => Boolean):Int =
    s.count(predicate)

  def size(s: String):Int = stats(s, _ => true)

  def countLetters(s:String): Int = stats(s, _.isLetter)

  def countDigits(s: String):Int = stats(s, _.isDigit)
}

object HEFuncs1 extends App {
  val app1 = new HEFuncs1
  val s = "Hello1234Smarty"
  println(s)
  println("size = "+app1.size(s))
  println("letters = "+app1.countLetters(s))
  println("digits = "+app1.countDigits(s))
  println("stats(s,_=='H') = "+app1.stats(s,_=='H'))
  println("stats(s,_.isUpper) = "+app1.stats(s,_.isUpper))
}
