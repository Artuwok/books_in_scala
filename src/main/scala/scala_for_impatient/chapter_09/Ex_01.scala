package scala_for_impatient.chapter_09

import scala.io.{BufferedSource, Source}


// Write a Scala code snippet that reverses the lines in a file (making the last line the first one, and
// so on).
object Ex_01 extends App {
  val fileSource: BufferedSource = Source.fromFile("/home/art/Desktop/qwe.txt")
  val reversedLines: Array[String] = fileSource.getLines().toArray.reverse
  for (line <- reversedLines) println(line)
}
