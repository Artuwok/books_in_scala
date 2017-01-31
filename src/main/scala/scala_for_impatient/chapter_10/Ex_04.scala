package scala_for_impatient.chapter_10

/** Provide a CryptoLogger trait that encrypts the log messages with the Caesar cipher. The key should
  * be 3 by default, but it should be overridable by the user. Provide usage examples with the
  * default key and a key of –3. */
object Ex_04 extends App with CryptoLogger {

  print(encrypt("Artem"))

}

trait CryptoLogger {
  val key: Byte = 3

  def encrypt(x: String): String = {
    val encrypted = x.toUpperCase().map(_.toInt + key)
    encrypted.map(_.toChar).toString()
  }
}
