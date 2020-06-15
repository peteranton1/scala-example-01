package com.example.unit03

class Exception1 {

}
object Exception1 extends App {
  val app1 = new Exception1()
  val b = try {
    "hello".toBoolean
  } catch {
    case ex: IllegalArgumentException =>
      println(s"Ignoring $ex: set false")
      false
    case ex: NullPointerException =>
      println(s"Ignoring $ex, setting true")
      true
  }
  println(s"b = $b")
}
