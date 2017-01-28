package scala_for_impatient.chapter_09

import java.io.FileWriter

import scala.io.Source

// Write a Scala program that reads a file with tabs, replaces each tab with spaces so that tab
// stops are at n-column boundaries, and writes the result to the same file.

object Ex_02 extends App{

  val fileSource: String = Source.fromFile("/home/art/Desktop/qwe.txt").mkString
  val replacedFile: String = fileSource.replace('\t', ' ')
  println(replacedFile)

  val fileWriter = new FileWriter("/home/art/Desktop/qwe1.txt")
  fileWriter.write(replacedFile)
  fileWriter.close()

}
