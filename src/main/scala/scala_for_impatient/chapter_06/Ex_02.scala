package scala_for_impatient.chapter_06

// The preceding problem wasn’t very object-oriented. Provide a general superclass UnitConversion
// and define objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.
abstract class Ex_02_UnitConversion {

  def inchesToCentimeters(inches: Double): Double

  def gallonsToLitres(gallons: Double): Double

  def milesToKilometers(miles: Double): Double

}

object InchesToCentimeters extends Ex_02_UnitConversion {

  override def inchesToCentimeters(inches: Double): Double = 2.54 * inches

  override def gallonsToLitres(gallons: Double): Double = ???

  override def milesToKilometers(miles: Double): Double = ???
}

object GallonsToLitres extends Ex_02_UnitConversion {
  override def inchesToCentimeters(inches: Double): Double = ???

  override def gallonsToLitres(gallons: Double): Double = 3.78541 * gallons

  override def milesToKilometers(miles: Double): Double = ???
}

object MilesToKilometers extends Ex_02_UnitConversion {
  override def inchesToCentimeters(inches: Double): Double = ???

  override def gallonsToLitres(gallons: Double): Double = ???

  override def milesToKilometers(miles: Double): Double = 1.60934 * miles
}
