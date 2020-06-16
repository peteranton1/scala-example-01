package com.example.unit4

class HEFuncs4 {
  def operationWithFallback(n: Int, operation: Int => Int, fallback: Int): Int =
    operation(n) match {
      case m if m > 0 => m
      case _ => fallback
    }
}

object HEFuncs4 extends App {
  val app1 = new HEFuncs4
  val op1: Int => Int = { n => n + 5 }
  val op2: Int => Int = n => n - 5
  println("op1(3,op1,99) = " +
    app1.operationWithFallback(3, op1,
      99))
  println("op1(-33,op1,99) = " +
    app1.operationWithFallback(-33, op1,
      99))
  println("op1(3,op2,99) = " +
    app1.operationWithFallback(3, op2,
      99))
  println("op1(33,op2,99) = " +
    app1.operationWithFallback(33, op2,
      99))
}