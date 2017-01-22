package scala_for_impatient.chapter_04

import scala.collection.mutable

// Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY , and similarly for the other
// weekdays. Demonstrate that the elements are visited in insertion order.
object Ex_06 extends App {

  java.util.Calendar.MONDAY

  val daysOfWeek: mutable.LinkedHashMap[String, Int] = new mutable.LinkedHashMap[String, Int]

  daysOfWeek("Monday") = java.util.Calendar.MONDAY
  daysOfWeek("Tuesday") = java.util.Calendar.TUESDAY
  daysOfWeek("Wednesday") = java.util.Calendar.WEDNESDAY
  daysOfWeek("Thursday") = java.util.Calendar.THURSDAY
  daysOfWeek("Friday") = java.util.Calendar.FRIDAY
  daysOfWeek("Saturday") = java.util.Calendar.SATURDAY
  daysOfWeek("Sunday") = java.util.Calendar.SUNDAY

  for ((k, v) <- daysOfWeek) println(k + " " + v)

}
