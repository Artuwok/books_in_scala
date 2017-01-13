package scala_for_impatient.chapter_03


//  Given an array of integers, produce a new array that contains all positive
//  values of the original array, in their original order, followed by all values that
//  are zero or negative, in their original order

object Ex_04 extends App {
  println(result(Array(1, -2, 3, -1, 6, -5, -3)).mkString(", "))

  def result(a: Array[Int]): Array[Int] = a.filter(_ > 0) ++ a.filter(_ <= 0)
}

