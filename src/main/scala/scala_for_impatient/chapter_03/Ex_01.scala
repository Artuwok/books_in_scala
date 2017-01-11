package scala_for_impatient.chapter_03

import scala.util.Random

// Write a code snippet that sets a to an array of n random integers between 0
// (inclusive) and n (exclusive)
object Ex_01 extends App{
  
  val n: Int = Random.nextInt(100)
  val a  = new Array[Int](n)
  for (i <- 0 until a.length){
    a(i) = Random.nextInt(n)
  }
  println(a.mkString(", "))
}
