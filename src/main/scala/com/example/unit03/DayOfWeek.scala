package com.example.unit03

class DayOfWeek {

  def dayOfWeek1(n:Int): String = {
    if(n == 1) "Sunday"
    else if(n == 2) "Monday"
    else if(n == 3) "Tueday"
    else if(n == 4) "Wednesday"
    else if(n == 5) "Thursday"
    else if(n == 6) "Friday"
    else if(n == 7) "Saturday"
    else "Unknown"
  }

  def dayOfWeek2(n:Int): String = n match {
    case 1 => "Sunday"
    case 2 => "Monday"
    case 3 => "Tueday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case 7 => "Saturday"
    case _ =>"Unknown"
  }

}

object DayOfWeek extends App {
  val app1 = new DayOfWeek()
  for(i <- 1 to 7){
    println("dayOfWeek1($i): " + app1.dayOfWeek1(i))
    println("dayOfWeek2($i): " + app1.dayOfWeek2(i))
  }
}
