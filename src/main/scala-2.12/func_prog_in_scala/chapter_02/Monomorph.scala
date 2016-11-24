package func_prog_in_scala.chapter_02

import scala.annotation.tailrec


object Monomorph {

  def main(args: Array[String]): Unit = {
    println(findFirst(Array("ss", "zz", "yy"), "yy"))
  }

  //example of monomorphic function
  def findFirst(ss: Array[String], key: String) = {
    @tailrec
    def loop(i: Int): Int = {
      if (i >= ss.length) -1
      else if (ss(i) == key) i
      else loop(i + 1)
    }
    loop(0)
  }

  // Example of polymorphic function
  def findFirstUniversal[A](as: Array[A], p: A => Boolean): Int = {
    @tailrec
    def loop(i: Int): Int = {
      if (i >= as.length) -1
      else if (p(as(i))) i
      else loop(i+1)
    }
    loop(0)
  }
}
