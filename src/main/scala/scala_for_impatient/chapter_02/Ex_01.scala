package scala_for_impatient.chapter_02

// The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
// Write a function that computes this value.
object Ex_01 extends App {

  def signum(x: Int) = if (x == 0) 0 else if (x < 0) -1 else 1
  print(signum(0))
}
