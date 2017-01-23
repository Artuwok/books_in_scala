package scala_for_impatient.chapter_05


// Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,” on page
// 49 so that it doesn’t turn negative at Int.MaxValue .
object Ex_01 extends App {


  class Counter {
    private var value = 0 // You must initialize the field
    def increment() { if (current < Int.MaxValue) {value += 1}  } // Methods are public by default
    def current = value
  }

}
