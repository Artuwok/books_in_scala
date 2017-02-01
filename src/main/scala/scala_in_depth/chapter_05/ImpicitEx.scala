package scala_in_depth.chapter_05


/** compiler will look for a variable
  * of type Int in the implicit scope. */
object ImpicitEx extends App {

  implicit val x = 10

  def findAnInt(implicit x: Int) = x

  println(findAnInt)
}
