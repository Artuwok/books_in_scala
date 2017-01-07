package scala_for_impatient.chapter_01

import scala.util.Random

//One way to create random file or directory names is to produce a random BigInt
// and convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul".
// Poke around Scaladoc to find a way of doing this in Scala.
object Ex_08 extends App {
  val x = BigInt.probablePrime(100, Random)
  println(x.toString(36))
}
