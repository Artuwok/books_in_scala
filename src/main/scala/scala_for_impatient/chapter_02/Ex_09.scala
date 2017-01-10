package scala_for_impatient.chapter_02

import scala.annotation.tailrec

// Make the function of the preceding exercise a recursive function.
object Ex_09 extends App {
  product("Hello")

  def product(s: String): Unit = {
    @tailrec
    def help(z: Long, array: Array[Char]): Long = {
      if (array.isEmpty) z else help(z * array.head.toInt, array.tail)
    }
    print(help(1L, s.toCharArray))
  }
}
