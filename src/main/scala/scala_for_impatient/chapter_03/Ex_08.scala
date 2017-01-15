package scala_for_impatient.chapter_03

import scala.collection.mutable.ArrayBuffer

// Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on page 32.
// Collect indexes of the negative elements, reverse the sequence, drop
// the last index, and call a.remove(i) for each index.
// Compare the efficiency of this approach with the two approaches in Section 3.4.
object Ex_08 extends App {

  val x = ArrayBuffer(1, 2, 3, 4, 5, -1, -2, -3)

  print(collect(x).mkString(", "))

  def collect(a: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var indexes = for (i <- a.indices if a(i) < 0) yield i

    indexes = indexes.reverse.dropRight(1)
    for (j <- 0 until indexes.length) a.remove(indexes(j))
    a
  }
}
