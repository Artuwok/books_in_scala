package scala_for_impatient.chapter_04

import scala.io.{BufferedSource, Source}

// Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
object Ex_04 extends App {

  val sourceFile: BufferedSource = Source.fromFile("/home/art/Desktop/qwe.txt")
  val wordArray = sourceFile.mkString.split("\\s+")
  var sortedImmutableMap = new scala.collection.immutable.TreeMap[String, Int]
  for (word <- wordArray) yield sortedImmutableMap = sortedImmutableMap + (word -> (sortedImmutableMap.getOrElse(word, 0) + 1))

  for ((k, v) <- sortedImmutableMap) println("word is: " + k + " count is: " + v )
}
