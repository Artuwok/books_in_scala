package scala_for_impatient.chapter_06

// The preceding problem wasn’t very object-oriented. Provide a general superclass UnitConversion
// and define objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.
abstract class Ex_02_UnitConversion {

  def inchesToCentimeters(inches: Double)

  def gallonsToLitres(gallons: Double)

  def milesToKilometers(miles: Double)

}

object InchesToCentimeters extends Ex_02_UnitConversion {

  override def inchesToCentimeters(inches: Double): Double = 2.54 * inches

  override def gallonsToLitres(gallons: Double): Unit = ???

  override def milesToKilometers(miles: Double): Unit = ???
}

object GallonsToLitres extends Ex_02_UnitConversion {
  override def inchesToCentimeters(inches: Double): Unit = ???

  override def gallonsToLitres(gallons: Double): Double = 3.78541 * gallons

  override def milesToKilometers(miles: Double): Unit = ???
}

object MilesToKilometers extends Ex_02_UnitConversion {
  override def inchesToCentimeters(inches: Double): Unit = ???

  override def gallonsToLitres(gallons: Double): Unit = ???

  override def milesToKilometers(miles: Double): Double = 1.60934 * miles
}
