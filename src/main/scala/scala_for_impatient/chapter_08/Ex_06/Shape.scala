package scala_for_impatient.chapter_08.Ex_06

// Define an abstract class Shape with an abstract method centerPoint and subclasses Rectangle and
// Circle . Provide appropriate constructors for the subclasses and override the centerPoint method in
// each subclass.
abstract class Shape {

  def centerPoint: (Double, Double)

}

class Rectangle(a: Double, b: Double) extends Shape {
  override def centerPoint = (a / 2, b / 2)
}

class Circle(r: Double) extends Shape {

  override def centerPoint = (0.0, 0.0)
}
