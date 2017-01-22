package scala_for_impatient.chapter_04

import scala.collection.immutable.Seq

// What happens when you zip together two strings, such as "Hello".zip("World") ? Come up with a
// plausible use case.
object Ex_10 extends App {

  val x: Seq[(Char, Char)] = "Hello".zip("World")
  println(x)
}
