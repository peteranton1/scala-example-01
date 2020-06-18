package com.example.unit4.ch24

case class CarC(model: String,
                owner: Option[PersonC],
                registrationPlate: Option[String])

case class PersonC(name: String,
                   age: Int,
                   drivingLicense: Option[String])
class ForComp1 {
   def ownerDrivingLicense1(optCar: Option[CarC],
                            ownerName: String): Option[String] =
    for {
      car <- optCar
      person <- car.owner
      if person.name == ownerName
      drivingLicense <- person.drivingLicense
    } yield drivingLicense

  def ownerBelowAge(car: CarC, age: Int): Option[String] =
    for {
      person <- car.owner
      if person.age < age
    } yield person.name

  def carWithLicensedOwner1(optCar: Option[CarC]): Option[CarC] = {
    val dl: Option[String] = for {
      car <- optCar
      person <- car.owner
      drivingLicense <- person.drivingLicense
    } yield drivingLicense
    dl match {
      case Some(dl) => optCar
      case _ => None
    }
  }

  def carWithLicensedOwner(optCar: Option[CarC]): Option[CarC] = {
    optCar.find {
      car => car.owner.flatMap(_.drivingLicense).isDefined
    }
  }
}

object ForComp1 extends App {
  val app1 = new ForComp1
  val car1 = CarC("escortA", Some(PersonC("Ted", 25, Some("xyZ"))), Some("ABC"))
  val car2 = CarC("escortB", None, Some("Abc123"))
  val car3 = CarC("escortC", Some(PersonC("Ted", 25, None)), Some("ABC"))

  println(app1.ownerDrivingLicense1(Some(car1), "Ted"))
  println(app1.ownerDrivingLicense1(Some(car2), "Ted"))
  println(app1.ownerBelowAge(car1, 30))
  println(app1.ownerBelowAge(car2, 30))
  println(app1.carWithLicensedOwner(Some(car1)))
  println(app1.carWithLicensedOwner(Some(car2)))
  println(app1.carWithLicensedOwner(Some(car3)))
}
