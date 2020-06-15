package com.example.unit02

sealed trait Color {
  def name = "Unknown"
}
object Red extends Color {
  override def name: String = "Red-ish"
}
object Green extends Color {
  override def name: String = "Green-ish"
}
object Blue extends Color {
  override def name: String = "Blue-ish"
}
