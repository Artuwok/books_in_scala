package scala_for_impatient.chapter_05

class Ex_10 {

  // Rewrite it to use explicit fields and a default primary constructor. Which form do you
  // prefer? Why?
  class Employee(val name: String, var salary: Double) {
    def this() {
      this("John Q. Public", 0.0)
    }
  }

  class Employee2(n: String = "John Q. Public", s: Double = 0.0) {
    val name: String = n
    var salary: Double = s
  }
}
