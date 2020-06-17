package com.example.unit4

case class PersonA(firstName: String,
                   middleName: Option[String],
                   lastName: String)

object PersonA extends App {

  def fullName(p:PersonA): String =
    p.middleName match {
      case Some(middle) => s"${p.firstName} $middle ${p.lastName}"
      case None => s"${p.firstName} ${p.lastName}"
    }

  val p1 = PersonA("George", Some("Watson"), "Lucas")
  val p2 = PersonA("Martin", None, "Odersky")
  println(fullName(p1))
  println(fullName(p2))
}
