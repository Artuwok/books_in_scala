package scala_for_impatient.chapter_03

// How do you compute the average of an Array[Double]

object Ex_05 extends App {

  val x = Array(0.6, 0.2, 0.9, 1.1)

  println(average(x))

  def average(x: Array[Double]): Double = x.foldLeft(0.0)(_ + _) / x.length

}
