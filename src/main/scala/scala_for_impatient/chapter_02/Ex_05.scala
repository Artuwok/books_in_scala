package scala_for_impatient.chapter_02

// Write a procedure countdown(n: Int) that prints the numbers from n to 0.
object Ex_05 extends App {

  countdown(10)

  def countdown(n: Int): Unit = {
    for (i <- n to 0 by -1) println(i)
  }
}
