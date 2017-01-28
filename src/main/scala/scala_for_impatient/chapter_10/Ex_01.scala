package scala_for_impatient.chapter_10

/** The java.awt.Rectangle class has useful methods translate and grow that are unfortunately absent
  * from classes such as java.awt.geom.Ellipse2D . In Scala, you can fix this problem. Define a trait
  * RectangleLike with concrete methods translate and grow . Provide any abstract methods that you need
  * for the implementation, so that you can mix in the trait like this:
  * val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  *egg.translate(10, -10)
  *egg.grow(10, 20) */
object Ex_01 {
  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  egg.translate(10, -10)
  egg.grow(10, 20)
}

trait RectangleLike {
  self: java.awt.geom.Ellipse2D.Double =>

  def translate(dx: Int, dy: Int): Unit = self.setFrame(self.getX + dx, self.getY + dy, getWidth, getHeight)

  def grow(x: Int, y: Int): Unit = self.setFrame(getWidth, getHeight, self.getX, self.getY)
}