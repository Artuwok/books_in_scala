package scala_for_impatient.chapter_04

import java.util.Scanner

import scala.io.Source


// Write a program that reads words from a file. Use a mutable map to count
// how often each word appears. To read the words, simply use a java.util.Scanner:
// val in = new java.util.Scanner(java.io.File("myfile.txt"))
// while (in.hasNext()) process in.next()
// Or look at Chapter 9 for a Scalaesque way.
// At the end, print out all words and their counts.

object Ex_02 extends App {

  // Java way
  val wordsMap = new scala.collection.mutable.HashMap[String, Int]
  val in = new Scanner(new java.io.File("/home/art/Desktop/qwe.txt"))
  while (in.hasNext) {
    val word = in.next()
    val count = wordsMap.getOrElse(word, 0)
    wordsMap(word) = count + 1
    in.next()
  }
  wordsMap.foreach(p => println("word is: " + p._1, " count is: " + p._2))

  println("---Scala way---")
  // Scala way
  val secondWordsMap = new scala.collection.mutable.HashMap[String, Int]
  val file = Source.fromFile("/home/art/Desktop/qwe.txt")
  val tokens: Array[String] = file.mkString.split("\\s+") // s+ one or many white spaces

  for (word <- tokens) yield {
    if (!secondWordsMap.contains(word)) {
      secondWordsMap(word) = 1
    }
    else secondWordsMap(word) = secondWordsMap(word) + 1
  }

  secondWordsMap.foreach(p => println("word is: " + p._1 + " count is: " + p._2))
}
