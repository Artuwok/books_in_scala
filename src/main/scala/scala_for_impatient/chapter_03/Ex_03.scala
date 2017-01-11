package scala_for_impatient.chapter_03

// Repeat the preceding assignment, but produce a new array with
// the swapped values. Use for / yield
object Ex_03 extends App {

  def swap(a: Array[Int]): Array[Int] = {

    for (i <- 0 until a.length - 1 by 2) yield {
      val left = a(i)
      a(i) = a(i + 1)
      a(i+1) = left
    }
  }

}
