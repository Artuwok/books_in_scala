package scala_for_impatient.chapter_08.Ex_08

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  // Don't want to reveal name . . .
  override val toString = "secret" // . . . or class name
}
