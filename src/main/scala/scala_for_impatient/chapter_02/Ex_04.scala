package scala_for_impatient.chapter_02

// Write a Scala equivalent for the Java loop
// for (int i = 10; i >= 0; i--) System.out.println(i);
object Ex_04 extends App {

  for (i <- 10 to 0 by -1) {
    println(i)
  }
}
