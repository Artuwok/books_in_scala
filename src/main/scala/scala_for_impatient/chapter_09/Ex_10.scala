package scala_for_impatient.chapter_09

import java.io._

// Expand the example with the serializable Person class that stores a collection of friends.
// Construct a few Person objects, make some of them friends of another, and then save an
// Array[Person] to a file. Read the array back in and verify that the friend relations are intact.
object Ex_10e extends App {

  val p = new Person
  p.a = Array(new Person)
  p.name = "Ulrich"

  val writer = new ObjectOutputStream(new FileOutputStream("/home/art/Desktop/person.txt"))
  writer.writeObject(p)
  writer.flush()
  writer.close()

  val reader = new ObjectInputStream(new FileInputStream("/home/art/Desktop/person.txt"))
  val restoredPerson = reader.readObject().asInstanceOf[Person]
  print(restoredPerson)

}

class Person extends Serializable {
  var name: String = "Art"
  var a: Array[Person] = Array()

  override def toString: String = name + " " + a.toList
}
