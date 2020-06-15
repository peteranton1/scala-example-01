package com.example.unit03

class TransformPartialFunction {
  val transform: PartialFunction[String, String] = {
    case a if a.startsWith("a") => a.reverse
    case s if s.startsWith("s") => s.toUpperCase
  }
}
object TransformPartialFunction extends App {
  val app1 = new TransformPartialFunction()
  println("transform \"alfie\" = " + app1.transform("alfie"))
  println("transform \"sammy\" = " + app1.transform("sammy"))
  println("transform \"bertie\" = " + app1.transform("bertie"))
}