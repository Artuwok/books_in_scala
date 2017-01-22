package scala_for_impatient.chapter_04

// Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of
// values less than v , equal to v , and greater than v

object Ex_09 extends App{

  println(lteqgt(Array(1, 2, 3, 4, 5, 6, 7, 8), 5))

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    var less = 0
    var more = 0
    var same = 0
    for (x <- values) if (x < v) less += 1 else if (x == v) same += 1 else more += 1
    (less, same, more)
  }
}
