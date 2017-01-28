package scala_for_impatient.chapter_09

import scala.io.Source

// Write a Scala program that prints the src attributes of all img tags of a web page. Use regular
// expressions and groups.
object Ex_08 extends App {

  val page = Source.fromURL("http://stackoverflow.com/questions/12643009/regular-expression-for-floating-point-numbers").mkString
  val reg = "img src\\s*=\\s*\"(.+?)\"".r
  println(reg.findAllIn(page).toList)
}
