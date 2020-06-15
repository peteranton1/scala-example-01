package com.example.unit03

import java.time.ZonedDateTime

class ObjInfo {
  def objInfo(param: Any) = param match { //#A
    case n: Int if n > 0 => s"$n is a positive integer" //#B
    case d: Double => s"$d is a double" //#C
    case "ping" => "pong" //#D
    case _: String => s"you gave me a string: $param" //#E
    case obj => obj.toString //#F
  }
}
object ObjInfo extends App {
  val app1 = new ObjInfo()
  println("Int: 5 = "+app1.objInfo(5))
  println("Int: -5 = "+app1.objInfo(-5))
  println("Double: 5.0 = "+app1.objInfo(5.0))
  println("ping: = "+app1.objInfo("ping"))
  println("pingy: = "+app1.objInfo("pingy"))
  println("Date: = "+app1.objInfo(ZonedDateTime.now()))
}
