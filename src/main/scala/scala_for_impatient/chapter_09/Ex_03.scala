package scala_for_impatient.chapter_09

import scala.io.Source

// Write a Scala code snippet that reads a file and prints all words with more than 12 characters to
// the console. Extra credit if you can do this in a single line.
object Ex_03 extends App{

  val wordsCount = Source.fromFile("/home/art/Desktop/qwe.txt").mkString.split("\\s+").filter(_.length > 12).toList

  for (word <- wordsCount) println(word)

}
