package scala_for_impatient.chapter_04

// Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest
// values in the array.
object Ex_08 extends App {

  println(minmax(Array(1, 2, 3, 4, 5, 6, 8)).toString())
  def minmax(x: Array[Int]): (Int, Int) = (x.min, x.max)
}
