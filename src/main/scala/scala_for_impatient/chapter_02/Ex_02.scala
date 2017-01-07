package scala_for_impatient.chapter_02

// What is the value of an empty block expression {} ? What is its type?
object Ex_02 extends App {
  val x: Unit = {}
  print(x.getClass)
}
