package com.example.unit03

case class ApplyDiscount() {

  def discount(amount: Double): Double = amount match {
    case d if d < 50.0 => 0.0
    case d if d < 100 => 0.1
    case _ => 0.15
  }
}

object ApplyDiscount extends App {
  val pet = ApplyDiscount()
  println("discount(47.3)=" + pet.discount(47.3))
  println("discount(67.3)=" + pet.discount(67.3))
  println("discount(147.3)=" + pet.discount(147.3))
}