package scala_for_impatient.chapter_02

// Write a function product(s : String) that computes the product, as described in the preceding exercises.
object Ex_08 extends App {

  product("Hello")

  def product(s: String): Unit = {
    var x = 1L
    for (i <- s) {
      x *= i.toInt
    }
    print(x)
  }
}
