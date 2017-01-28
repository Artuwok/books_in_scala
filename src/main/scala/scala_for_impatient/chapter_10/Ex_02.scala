package scala_for_impatient.chapter_10

import java.awt.Point

/** Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point . Use lexicographic
  * ordering, i.e. (x, y) < (x’, y’) if x < x’ or x = x’ and y < y’. */
object Ex_02 extends App {

  val p = new OrderedPoint(1, 2)
  val p2 = new OrderedPoint(1, 2)
  print(p.compare(p))

}

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point] {
  override def compare(that: Point): Int =
    if (this.x < that.x) 1
    else if (this.x == that.x && this.y < that.y) 1
    else if (this.x == that.x && this.y == that.y) 0
    else -1
}
