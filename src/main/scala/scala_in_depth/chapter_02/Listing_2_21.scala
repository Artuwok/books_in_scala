package scala_in_depth.chapter_02


/** Generically converting functions
  *
  * The lift3 function takes a
  * function of three arguments as input and outputs a new function of three arguments. */

object Listing_2_21 {
  def lift3[A, B, C, D](f: (A, B, C) => D): (Option[A], Option[B], Option[C]) => Option[D] = {
    (oa: Option[A], ob: Option[B], oc: Option[C]) => for (a <- oa; b <- ob; c <- oc) yield f(a, b, c)
  }
}
