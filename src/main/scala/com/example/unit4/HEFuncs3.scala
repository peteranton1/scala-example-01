package com.example.unit4

sealed trait Mode

case object Length extends Mode

case object Letters extends Mode

case object Digits extends Mode

case object Whitespace extends Mode

class HEFuncs3 {
  def stats(s: String, predicate: Char => Boolean): Int =
    s.count(predicate)

  def predicateSelector(mode: Mode): Char => Boolean =
    mode match {
      case Length => _ => true
      case Letters => _.isLetter
      case Digits => _.isDigit
      case Whitespace => _.isWhitespace
    }
}

object HEFuncs3 extends App {
  val app1 = new HEFuncs3
  val s = "Hello1234 Smarty"
  println(s)
  println("size = " + app1.stats(s, app1.predicateSelector(Length)))
  println("letters = " + app1.stats(s, app1.predicateSelector(Letters)))
  println("digits = " + app1.stats(s, app1.predicateSelector(Digits)))
  println("ws = " + app1.stats(s, app1.predicateSelector(Whitespace)))
  println("stats(s,_=='H') = " + app1.stats(s, _ == 'H'))
  println("stats(s,_.isUpper) = " + app1.stats(s, _.isUpper))
}

