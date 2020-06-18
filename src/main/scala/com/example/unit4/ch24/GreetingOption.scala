package com.example.unit4.ch24

class GreetingOption {
  def greetings(s: Option[String] = None):String =
    s match {
      case Some(text) => text
      case None => "Greetings, Human"
    }
}
object GreetingOption extends App {
  val app1 = new GreetingOption
  println(app1.greetings(Some("Hello Scala")))
  println(app1.greetings())

}