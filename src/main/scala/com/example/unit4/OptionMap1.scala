package com.example.unit4

case class CarB(model: String,
                owner: Option[PersonB],
                registrationPlate: Option[String])

case class PersonB(name: String,
                   age: Int,
                   drivingLicense: Option[String])

class OptionMap1 {
  def ownerName(car: CarB): Option[String] =
    car.owner.map(p => p.name)

  def extractRegistrationPlate(car: CarB): Option[String] =
    car.registrationPlate.map(_.toUpperCase)

  def ownerDrivingLicense(car: CarB): Option[String] =
    car.owner.flatMap(_.drivingLicense)

  def superFlatten(opt: Option[Option[Option[String]]]): Option[String] =
    opt match {
      case Some(opt) => opt.flatten
      case None => None
    }

  def ownerBelowAge(car: CarB, age: Int): Option[String] =
    car.owner match {
      case Some(opt) if opt.age < age => Some(opt.name)
      case None => None
    }
}

object OptionMap1 extends App {
  val app1 = new OptionMap1
  val car1 = CarB("escortA", Some(PersonB("Ted", 25, Some("xyZ"))), Some("ABC"))
  val car2 = CarB("escortB", None, Some("Abc123"))
  println(app1.ownerName(car1))
  println(app1.ownerName(car2))
  println(app1.extractRegistrationPlate(car1))
  println(app1.extractRegistrationPlate(car2))
  println(app1.ownerDrivingLicense(car1))
  println(app1.ownerDrivingLicense(car2))
  val opt = Some(Some(Some("AbD")))
  println(app1.superFlatten(opt))
  println(app1.ownerBelowAge(car1, 30))
  println(app1.ownerBelowAge(car1, 20))
  println(app1.ownerBelowAge(car2, 30))

}