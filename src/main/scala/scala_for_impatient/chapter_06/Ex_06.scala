package scala_for_impatient.chapter_06

//  Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.

object Ex_06 extends Enumeration {
  val krest = Value("♣")
  val bubna = Value("♦")
  val serdce = Value("♥")
  val pika = Value("♠")

}

object test extends App {

  println(Ex_06.krest, Ex_06.bubna, Ex_06.serdce, Ex_06.pika)
}
