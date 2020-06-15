package com.example.unit03

sealed trait Currency
object USD extends Currency
object GBP extends Currency
object EUR extends Currency
object CAD extends Currency

class CurrencyMatchTest {
  def exchangeRateUSD(currency:Currency): Double =
    currency match {
      case USD => 1.0
      case GBP => 0.744
      case EUR => 0.848
      case _ => -1.0
    }
}
object CurrencyMatchTest extends App {
  def app1 = new CurrencyMatchTest()
  println("USD = " + app1.exchangeRateUSD(USD))
  println("GBP = " + app1.exchangeRateUSD(GBP))
  println("EUR = " + app1.exchangeRateUSD(EUR))
  println("CAD = " + app1.exchangeRateUSD(CAD))
}
