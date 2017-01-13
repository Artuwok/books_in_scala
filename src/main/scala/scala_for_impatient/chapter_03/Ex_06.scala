package scala_for_impatient.chapter_03

import scala.collection.mutable.ArrayBuffer

// How do you rearrange the elements of an Array[Int] so that they appear in
// reverse sorted order? How do you do the same with an ArrayBuffer[Int]?

object Ex_06 extends App {
  println(Array(3, 1, 2, 4, 5, 6).sorted.reverse.mkString(", "))
  println(ArrayBuffer(3, 1, 2, 4, 5, 6).sorted.reverse.mkString(", "))
}
