package scala_for_impatient.chapter_04

import scala.collection.immutable.HashMap
import scala.io.BufferedSource

// Repeat the preceding exercise with an immutable map.
object Ex_03 extends App {

  val sourceFile: BufferedSource = scala.io.Source.fromFile("/home/art/Desktop/qwe.txt")
  val wordsArray: Array[String] = sourceFile.mkString.split("\\s+")
  var immutableWordsMap = new HashMap[String, Int]


  for (word <- wordsArray) {
    if (immutableWordsMap.contains(word))
      immutableWordsMap = immutableWordsMap + (word -> (immutableWordsMap.getOrElse(word, 0) + 1))
    else
      immutableWordsMap = immutableWordsMap + (word -> 1)
  }

  for ((k, v) <- immutableWordsMap) println("Word is: " + k + " " + "count is: " + v)
}
