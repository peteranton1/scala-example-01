package com.example

import com.example.domain.Book

case class BookRepository(itemCount: Int) {
  //  def List<Book> findAllBooks() {
  //
  //  }
  def categorizeDayOfWeek(n: Int) = {
    if (n == 1 || n == 7) {
      "weekend"
    } else if (n > 1 && n < 7) {
      "weekday"
    } else {
      "unknown"
    }
  }

  def evenOrOdd(n: Int) =
    if(n % 2 == 0) "even"
    else "odd"

  def echoN(msg: String, n: Int) = {
    var i = 0
    while(i<n) {
      println(msg + " " + i)
      i += 1
    }
  }
  def echoN2(msg: String, n: Int) = {
    for(i <- 0 to n){
      println(msg + " " + i)
    }
  }
}

object Main extends App {
  println("Hello, World!")
  val pet = BookRepository(7)
  println("echoN2[2]=" + pet.echoN2("Hello",2))
}