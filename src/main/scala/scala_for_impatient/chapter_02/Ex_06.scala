package scala_for_impatient.chapter_02


// Write a for loop for computing the product of the Unicode codes of all letters in a string.
// For example, the product of the characters in "Hello" is 9415087488L .
object Ex_06 extends App {

  var x: Long = 1
  for (i <- "Hello") {
    x = x * i.toInt
  }
  println(x)
}
