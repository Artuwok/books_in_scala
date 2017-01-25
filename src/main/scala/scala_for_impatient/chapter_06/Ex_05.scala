package scala_for_impatient.chapter_06

// Write a Scala application, using the App trait, that prints the command-line arguments in reverse
// order, separated by spaces. For example, scala Reverse Hello World should print World Hello.
object Ex_05 extends App {

  for (i <- args.reverse) print(i + " ")

}
