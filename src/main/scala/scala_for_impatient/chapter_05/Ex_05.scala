package scala_for_impatient.chapter_05

import scala.beans.BeanProperty

// Make a class Student with read-write JavaBeans properties name (of type String ) and id (of type Long ).
// What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala Should you ?
class Ex_05 {

  class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

}
