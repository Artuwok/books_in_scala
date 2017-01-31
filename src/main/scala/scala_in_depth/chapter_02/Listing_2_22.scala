package scala_in_depth.chapter_02

// Simple InstantaneousTime class
object Listing_2_22 {

}

trait InstanteniousTime {
  val rep: Int

  override def equals(other: Any): Boolean = other match {
    case that: InstanteniousTime =>
      if (that eq this) true else (that.## == this.##) && (that.rep == this.rep)
    case _ => false
  }

  override def hashCode(): Int = rep.##
}
