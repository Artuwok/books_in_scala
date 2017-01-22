package scala_for_impatient.chapter_04

import java.util

import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.io.Source

// Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
object Ex_05 extends App {

  val sourceFile = Source.fromFile("/home/art/Desktop/qwe.txt")
  val wordsArray = sourceFile.mkString.split("\\s+")
  var javaWords: mutable.Map[String, Int] = new util.TreeMap[String, Int].asScala

  for (word <- wordsArray) yield {
    if (!javaWords.contains(word)) {
      javaWords(word) = 1
    }
    else
      javaWords(word) = javaWords(word) + 1
  }
  for ((k, v) <- javaWords) println("Word is: " + k + " count is: " + v)
}
