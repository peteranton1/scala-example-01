package com.example.unit01

case class ApplyDiscount() {
  def hello = "Hello"

  def discount(amount:Double):Double =
    if(amount < 50.0) 0.0
    else if(amount < 100) 0.1
    else 0.15

}
object ApplyDiscount extends App {
  println("Hello, World!")
  val pet = ApplyDiscount()
  println("discount(47.3)=" + pet.discount(47.3))
  println("discount(67.3)=" + pet.discount(67.3))
  println("discount(147.3)=" + pet.discount(147.3))
}