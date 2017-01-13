package scala_for_impatient.chapter_03

// Repeat the preceding assignment, but produce a new array with
// the swapped values. Use for / yield
object Ex_03 extends App {

  val x = Array(1, 2, 3, 4, 5)

  println(swap(x).mkString(", "))

  def swap(a: Array[Int]): Array[Int] = {
    for (elem <- 0 until a.length)
      yield {
        if (elem % 2 == 0) {
          if (elem == a.length - 1) a(elem)
          else a(elem + 1)
        }
        else a(elem - 1)
      }
  }.toArray
}
