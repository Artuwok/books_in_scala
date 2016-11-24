package func_prog_in_scala.chapter_02

import scala.annotation.tailrec

object MyModule {



  private def formatABS(n: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(n, abs(n))
  }

  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def factorial(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }
    go(n, 1)
  }

  // HOF
  private def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult(" absolute value ", -42, abs))
    println(formatResult(" factorial value ", 7, factorial))
  }
}
