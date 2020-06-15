package com.example.unit02

object AnimalCatDogMain {
  def main(args: Array[String]): Unit = {
    val tiggerTheDog = new Dog("Tigger")
    val cat = new Cat

    def feedTreat(animal: Animal) = animal.eat("treat")

    println(feedTreat(tiggerTheDog))
    println(feedTreat(cat))
    welcome(tiggerTheDog)
    //welcome(cat)
  }

  def welcome(nameable: Nameable) =
    println(s"Hi, ${nameable.name}!")

}
