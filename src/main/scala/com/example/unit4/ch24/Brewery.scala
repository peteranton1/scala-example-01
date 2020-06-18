package com.example.unit4.ch24

case class Brewery(name:String)
case class Beer(name:String, brewery:Brewery)

object BeerBrewery extends App {
  val brewA = Brewery("Carlsberg")
  val beerA = Beer("Special", brewA)
  val beerB = beerA.copy(name="Hyper")
  println(s"Brewery: $brewA")
  println(s"Beer: $beerA")
  println(s"Beer: $beerB")
}