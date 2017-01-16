package scala_for_impatient.chapter_04

// Set up a map of prices for a number of gizmos that you covet. Then produce
// a second map with the same keys and the prices at a 10 percent discount.
object Ex_01 extends App {

  val x = Map("PC" -> 12.0, "Notebook" -> 500.0, "Monitor" -> 222.0)
  val y: Map[String, Double] = for ((k, v) <- x) yield (k, v * 0.9)
  println(y.mkString(", "))

}
