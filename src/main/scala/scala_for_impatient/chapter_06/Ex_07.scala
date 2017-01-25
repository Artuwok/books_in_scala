package scala_for_impatient.chapter_06

// Implement a function that checks whether a card suit value from the preceding exercise is red
object Ex_07 extends App {

  println(isRed(Ex_06.serdce))

  def isRed(x: Ex_06.Value): Boolean = {
    if (x == Ex_06.serdce || x == Ex_06.bubna) true else false
  }
}
