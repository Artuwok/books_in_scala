package scala_for_impatient.chapter_03

//Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
// that are in America. Strip off the "America/" prefix and sort the result.
object Ex_09 extends App {

  val am = "America/"
  val z = java.util.TimeZone.getAvailableIDs.filter(_.startsWith(am)).map(_.stripPrefix(am))
  println(z.mkString(", "))
}
