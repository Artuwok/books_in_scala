package scala_for_impatient.chapter_05

// In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,” on page 49,
// provide a primary constructor that turns negative ages to 0.
class Ex_06 {

  class Person (var age: Int) {
    if (age < 0) age = 0 else age
  }
}
