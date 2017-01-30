package scala_in_depth.chapter_02

/** Executing code if option is defined */
object Listing_2_18 extends App {

  val a: Option[Int] = Option(3)

  val b: Option[Int] = None

  // foreach works with Option. If Option has value foreach will run for 1 time, else it will not run
  for (i <- a) println(i)

  // Should not print, since Option contains None
  for (i <- b) println(i)
}
