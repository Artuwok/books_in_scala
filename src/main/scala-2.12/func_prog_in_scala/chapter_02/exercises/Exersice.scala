package func_prog_in_scala.chapter_02.exercises

object Exersice {

  //EXERCISE 2.3
  //currying,  which converts a function f of two arguments
  //into a function of one argument that partially applies f . Here again there’s only one
  //implementation that compiles. Write this implementation.

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a,b)

}
