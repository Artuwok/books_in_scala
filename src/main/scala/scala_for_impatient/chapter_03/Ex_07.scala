package scala_for_impatient.chapter_03

// Write a code snippet that produces all values from an array with duplicates
// removed. (Hint: Look at Scaladoc.)
object Ex_07 extends App {

  println(Array(1, 2, 2, 1, 3, 23, 4, 3).distinct.mkString(", "))

}
