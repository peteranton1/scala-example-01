package com.example.unit4.ch24

case class Author(forename: String, surname: String)

sealed trait Genre

case object Drama extends Genre

case object Horror extends Genre

case object Romantic extends Genre

case class Book(title: String, author: Author, genre: Genre)

object BookMain extends App {
  val b1 = Book("Scary Stories", Author("Ivan", "Scarem"), Horror)
  val b2 = Book("My Drama", Author("We", "Weep"), Drama)
  val b3 = Book("Lovers at night", Author("Smooch", "Kisser"), Romantic)
  println(b1)
  println(b2)
  println(b3)
}