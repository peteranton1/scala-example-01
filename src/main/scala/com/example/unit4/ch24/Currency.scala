package com.example.unit4.ch24

sealed trait Currency
case object USD extends Currency
case object CAD extends Currency
case object EUR extends Currency

object CurrencyMain extends App {
  println(USD)
  println(CAD)
  println(EUR)
}
