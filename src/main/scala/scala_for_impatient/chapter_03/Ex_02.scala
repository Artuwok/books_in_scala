package scala_for_impatient.chapter_03

// Write a loop that swaps adjacent elements of an array of integers.
// For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5) .

object Ex_02 extends App {
 print(swap(Array(1,2,3,4,5)).mkString(", "))
  def swap(x: Array[Int]): Array[Int] = {
    for (i <- 0 until x.length-1 by 2){
      var left = x(i)
      x(i) = x(i+1)
      x(i+1) = left
    }
    x
  }
}
