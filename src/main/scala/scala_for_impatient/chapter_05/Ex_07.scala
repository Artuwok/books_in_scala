package scala_for_impatient.chapter_05

// Write a class Person with a primary constructor that accepts a string containing a first name, a
// space, and a last name, such as new Person("Fred Smith") . Supply read-only properties firstName and
// lastName . Should the primary constructor parameter be a var , a val , or a plain parameter? Why?

class Ex_07 {

  class Person (data: String) {
    val firstName: String = data.split(" ")(0)
    val lastName: String = data.split(" ")(1)
  }

}
