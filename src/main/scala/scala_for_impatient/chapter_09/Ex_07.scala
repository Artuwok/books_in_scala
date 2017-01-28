package scala_for_impatient.chapter_09

import scala.io.Source
import scala.util.matching.Regex

// Write a Scala program that reads a text file and prints all tokens in the file that are not floating-
// point numbers. Use a regular expression.
object Ex_07 extends App {

  val sourceFile = Source.fromFile("/home/art/Desktop/qwe.txt").mkString
  val reg: Regex = "[+-]?([0-9]*[.])?[0-9]+".r
  println(reg.replaceAllIn(sourceFile, ""))

}
