package com.example.unit01

class VendingMachine {
  var chocolateBar = 0
  var granolaBar = 0
  var totalMoney = 0.0

  def summary(): String = {
    s"chocolateBar: $chocolateBar" +
      s", granolaBar: $granolaBar" +
      s", totalMoney: $totalMoney"
  }

  def buy(product: String, money: Double): String =
    if (!isProductAvailable(product))
      s"Sorry, product $product not available"
    else if (!isMoneyEnough(product, money))
      s"Please insert more money"
    else
      completeRequest(product, money)

  def isProductAvailable(product: String): Boolean = {
    val productQuantity = {
      if(product == "chocolate") chocolateBar
      else if(product == "granola") granolaBar
      else 0
    }
    productQuantity > 0
  }

  def isMoneyEnough(product: String, money: Double): Boolean = {
    val cost = if(product == "chocolate") 1.5 else 1
    money >= cost
  }

  def completeRequest(product: String, money: Double): String = {
    collectMoney(money)
    releaseProduct(product)
    s"There you go! Have a $product bar"
  }

  def collectMoney(money:Double) =
    totalMoney += money

  def releaseProduct(product: String) =
    if(product == "chocolate") chocolateBar -= 1
    else if(product == "granola") granolaBar -= 1
}

object VendingMachine extends App {
  val vend = new VendingMachine
  println(s"Start: ${vend.summary()}")
  println(vend.buy("chocolate",1.5))
  vend.chocolateBar+=2
  vend.granolaBar+=1
  println(vend.buy("chocolate",1.5))
  println(vend.buy("chocolate",1.0))
  println(vend.buy("granola",2.0))
  println(vend.buy("granola",2.0))

  println(s"Finish: ${vend.summary()}")
}
