package scala_for_impatient.chapter_09

import scala.io.Source

// Make a regular expression searching for quoted strings "like this, maybe with \" or \\" in a Java
// or C++ program. Write a Scala program that prints out all such strings in a source file.

object Ex_06 extends App {
  var sourceFile = Source.fromFile("/home/art/Desktop/qwe.txt").mkString
  """\\\"""".r.findAllIn("""Hello \"Basile\" how are you ?""").foreach(println(_))
}
