package scala_in_depth.chapter_02

// Mutable Point2 class with hashing and equality
class Point2(var x: Int, var y: Int) extends Equals {

  def move(mx: Int, my: Int): Unit = {
    x += mx
    y += my
  }

  override def hashCode(): Int = y + (x * 31)

  override def canEqual(that: Any): Boolean = that match {
    case p: Point2 => true
    case _ => false
  }

  override def equals(that: Any): Boolean = {
     def strictEquals(that: Point2): Boolean =
       this.x == that.x && this.y == that.y
    that match {

      case a: AnyRef if this eq a => true
      case p: Point2 => (p canEqual this) && strictEquals(p)
      case _ => false

    }



  }
}
