package scala_for_impatient.chapter_06

// Write an enumeration describing the eight corners of the RGB color cube. As IDs, use the color
// values (for example, 0xff0000 for Red).

object Ex_08 extends Enumeration with App{

  val topRight = Value(0xff0000, "red")
  val topLeft = Value(0xffffff, "white")
  val bottomLeft = Value(0x00ff00, "green")
  val bottomRight = Value(0x0000ff, "blue")
  val backTopLeft = Value(0xffff00, "red-green")
  val backTopRight = Value(0xff00ff, "red-blue")
  val backBottomLeft = Value(0x00ffff, "green-blue")
  val backBottomRight = Value(0x000000, "black")

  for (i <- Ex_08.values){ println(i)}

}
