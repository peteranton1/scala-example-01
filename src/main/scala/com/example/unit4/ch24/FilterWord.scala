package com.example.unit4.ch24

class FilterWord {
  def filter(text:String,word:String):Option[String] =
    if(text.contains(word)) Some(text) else None
}
object FilterWord extends App {
  val app1 = new FilterWord
  val s = "Here is a sentence"
  val w1 = "Henry"
  val w2 = "sentence"
  println(s + s": $w1 = " +app1.filter(s,w1))
  println(s + s": $w2 = " +app1.filter(s,w2))
}
