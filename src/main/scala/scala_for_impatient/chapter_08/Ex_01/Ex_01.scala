package scala_for_impatient.chapter_08.Ex_01

object Ex_01 extends App {

  val account = new CheckingAccount(10.0)
  val amount: Double = account.deposit(10)
  print(amount)

}
