package scala_for_impatient.chapter_08.Ex_02

import scala_for_impatient.chapter_08.Ex_01.BankAccount

//Extend the BankAccount class of the preceding exercise into a class SavingsAccount that earns interest
//every month (when a method earnMonthlyInterest is called) and has three free deposits or
//withdrawals every month. Reset the transaction count in the earnMonthlyInterest method.
class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {

  private var operationsCount: Int = 0

  override def deposit(amount: Double): Double = {
    if (operationsCount <= 3) {
      operationsCount += 1
      super.deposit(amount)
    }
    else {
      super.deposit(amount) - earnMonthlyInterest(5)
    }
  }

  def earnMonthlyInterest(monthInterest: Double): Double = {
    operationsCount = 0
    monthInterest
  }

  override def withdraw(amount: Double): Double = {
    if (operationsCount <= 3) {
      operationsCount += 1
      super.withdraw(amount)
    }
    else {
      super.withdraw(amount) - earnMonthlyInterest(5)
    }
  }
}
