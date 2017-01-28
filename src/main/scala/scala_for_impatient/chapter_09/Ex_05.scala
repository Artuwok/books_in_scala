package scala_for_impatient.chapter_09

import java.io.FileWriter


// Write a Scala program that writes the powers of 2 and their reciprocals to a file, with the
// exponent ranging from 0 to 20. Line up the columns:

// 1   1
// 2   0.5
// 4   0.25

object Ex_05 extends App {

  val fileWriter = new FileWriter("/home/art/Desktop/powers.txt")

  val powers = for (i <- 0 to 20) {
    val str = Math.pow(2.0, i).toString
    val z = Math.pow(2.0, -i)

    fileWriter.write(str + " " + z)
    fileWriter.write('\r')
  }
  fileWriter.close()
}
