package com.example.unit03

class Exception2 {
  def parseInt(s: String): Int = {
    val n = try {
      s.toInt
    } catch {
      case ex: Exception =>
        println(s"Ignoring $ex, setting default")
        0
    }
    n
  }
}
object Exception2 extends App {
  val app1 = new Exception2()
  println("\"42\" = " + app1.parseInt("42"))
  println("\"42.2\" = " + app1.parseInt("42.2"))
  println("\"dell\" = " + app1.parseInt("dell"))
}
