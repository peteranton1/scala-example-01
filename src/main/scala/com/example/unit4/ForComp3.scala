package com.example.unit4

case class StudentB(id: Long, name: String, tutor: Option[ProfessorB])

case class ProfessorB(id: Long, name: String, assistant: Option[AssistantB])

case class AssistantB(id: Long, name: String)

class ForComp3 {
  def tutorName(student: StudentB): Option[String] =
    for {
      professor <- student.tutor
      name <- Some(professor.name)
    } yield name

  def assistantName(student: StudentB): Option[String] =
    for {
      professor <- student.tutor
      assistant <- professor.assistant
      name <- Some(assistant.name)
    } yield name

  def studentHasTutorWithId(student: StudentB, id0: Long): Option[StudentB] = {
    val id1 = for {
      professor <- student.tutor
    } yield professor.id
    id1 match {
      case Some(id2) if id2 == id0 => Some(student)
      case _ => None
    }
  }
}

object ForComp3 extends App {
  val a1 = AssistantB(1L, "Albert")
  val p2 = ProfessorB(2L, "Bertie", Some(a1))
  val p3 = ProfessorB(3L, "Charlie", None)
  val s4 = StudentB(4L, "Dave", Some(p2))
  val s5 = StudentB(5L, "Evelyn", Some(p3))
  val s6 = StudentB(6L, "Freddie", None)
  val app1 = new ForComp3
  println(app1.tutorName(s4))
  println(app1.tutorName(s5))
  println(app1.tutorName(s6))
  println(app1.assistantName(s4))
  println(app1.assistantName(s5))
  println(app1.assistantName(s6))
  println(app1.studentHasTutorWithId(s4, 2L))
  println(app1.studentHasTutorWithId(s5, 2L))
  println(app1.studentHasTutorWithId(s6, 2L))
}
