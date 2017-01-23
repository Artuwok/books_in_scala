package scala_for_impatient.chapter_05


// Write a class BankAccount with methods deposit and withdraw , and a read-only property balance.
class Ex_02 {
  private var balance = 0.0

  def deposit(amount: Double) = balance += amount
  def withdrawal(amount: Double) = balance -= amount
  def getBalance = balance

}
