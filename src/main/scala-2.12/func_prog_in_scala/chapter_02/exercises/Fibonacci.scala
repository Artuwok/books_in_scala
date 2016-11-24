package func_prog_in_scala.chapter_02.exercises

import scala.annotation.tailrec

object Fibonacci {

  def main(args: Array[String]): Unit = {
    println(fib(10))
  }

  def fib(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int, next: Int): Int = {
      if (n == 0) acc
      else go(n - 1, next, acc+next)
    }
    go(n, 0, 1)
  }
}
