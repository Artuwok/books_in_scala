package scala_for_impatient.chapter_06

// Define a Point class with a companion object so that you can construct Point instances as Point(3,4), without using new.
class Ex_04 {

  class Point private(val x: Int, val y: Int) {}

  object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
  }

  val p: Point = Point(3, 4)
}
