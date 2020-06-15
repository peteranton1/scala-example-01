package com.example.unit02

class Furniture(name:String, color: Color) {
  override def toString: String = s"$name, ${color.name}"
}
object Furniture extends App {
  val sofa = new Furniture("sofa", Red)
  val chair = new Furniture("chair", Blue)
  println(sofa.toString)
  println(chair.toString)
}