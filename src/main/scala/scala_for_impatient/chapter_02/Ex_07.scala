package scala_for_impatient.chapter_02

// Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc)
object Ex_07 extends App {
  println("Hello".foldLeft(1L)(_ * _.toInt))
}
