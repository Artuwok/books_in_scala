package scala_for_impatient.chapter_09

import scala.io.Source


// Write a Scala program that reads a text file containing only floating-point numbers. Print the
// sum, average, maximum, and minimum of the numbers in the file.
object Ex_04 extends App {

  val sourceFile = Source.fromFile("/home/art/Desktop/double.txt").mkString.split("\\s+")
  val floatIterator = for (token <- sourceFile) yield token.toFloat

  val array = floatIterator.toArray

  println(array.max)
  println(array.min)
  println(array.sum)
  println(array.sum / array.size)

}
