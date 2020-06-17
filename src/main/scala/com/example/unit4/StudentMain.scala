package com.example.unit4

case class Student(id: Long, name: String, tutor: Option[Professor])

case class Professor(id: Long, name: String, assistant: Option[Assistant])

case class Assistant(id: Long, name: String)

class StudentMain {
  def tutorName(student: Student): Option[String] =
    student.tutor.map(_.name)

  def assistantName(student: Student): Option[String] =
    student.tutor.flatMap(a => a.assistant.map(_.name))

  def studentHasTutorWithId(student: Student, id: Long): Option[Student] =
    student.tutor match {
      case Some(p) if p.id == id => Some(student)
      case _ => None
    }

}
object StudentMain extends App {
  val a1 = Assistant(1L,"Albert")
  val p2 = Professor(2L,"Bertie", Some(a1))
  val p3 = Professor(3L,"Charlie", None)
  val s4 = Student(4L, "Dave", Some(p2))
  val s5 = Student(5L,"Evelyn",Some(p3))
  val s6 = Student(6L,"Freddie", None)
  val app1 = new StudentMain
  println(app1.tutorName(s4))
  println(app1.tutorName(s5))
  println(app1.tutorName(s6))
  println(app1.assistantName(s4))
  println(app1.assistantName(s5))
  println(app1.assistantName(s6))
  println(app1.studentHasTutorWithId(s4,2L))
  println(app1.studentHasTutorWithId(s5, 2L))
  println(app1.studentHasTutorWithId(s6, 2L))
}