package com.example.unit01

class Coordinate(latitude:Double, longitude: Double) {
  def getString(): String = {
    s"Coordinate($latitude, $longitude)"
  }
}
object Coordinate extends App {
  val lat = 2.222
  val lon = 3.333
  val coord = new Coordinate(lat, longitude = lon)
  println(coord.getString())
}
