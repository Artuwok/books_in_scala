package scala_for_impatient.chapter_08.Ex_08

class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}
