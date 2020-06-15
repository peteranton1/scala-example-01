package com.example.unit03

class HelloAnon {
  def hello1(n: String): String = s"Hello, $n!"
  def hello2: String => String = { n: String => s"Hello, $n!" }
}
object HelloAnon extends App {
  val app1 = new HelloAnon()
  println("hello1( 'fred' ) = " + app1.hello1("fred"))
  println("hello2( 'fred' ) = " + app1.hello2("fred"))
}