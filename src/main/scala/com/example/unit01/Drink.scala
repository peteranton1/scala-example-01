package com.example.unit01

abstract class Drink {
  def fix(): String
}
class HotDrink(name: String) extends Drink {
  override def fix(): String = s"$name: reheat me"
}
class ColdDrink(name: String) extends Drink {
  override def fix(): String = s"$name: ice me"
}
object Drinkl extends App {
  val tea = new HotDrink("Tea")
  val coke = new ColdDrink("Coca-cola")
  println(tea.fix())
  println(coke.fix())
}