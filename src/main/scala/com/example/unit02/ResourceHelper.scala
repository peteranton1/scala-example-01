package com.example.unit02

class ResourceHelper {

  def readFileIntoString(filename: String): String = {
    import scala.io.Source
    Source.fromFile(filename)
      .getLines()
      .mkString("\n")
  }
}
