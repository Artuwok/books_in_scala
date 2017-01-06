package functional_programming_in_scala.chapter_02.exercises

object Exersice {

  //EXERCISE 2.3
  //currying,  which converts a function f of two arguments
  //into a function of one argument that partially applies f . Here again there’s only one
  //implementation that compiles. Write this implementation.

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

  // Explanation of above function
  def curryInDetails[A,B,C](f: (A, B) => C): A => (B => C) = {
    def aToBToC(a: A): B => C = {
      def bToC(b: B): C = {
        f(a,b)
      }
      bToC
    }
    aToBToC
  }

  // EXERCISE 2.4
  //Implement uncurry , which reverses the transformation of curry . Note that since =>
  // associates to the right, A => (B => C) can be written as A => B => C .

   def uncurry[A,B,C](f: A=>B=>C): (A,B)=>C = {
    (a: A, b: B) => f(a)(b)
  }

  //EXERCISE 2.5
  //Implement the higher-order function that composes two functions.
  //*compose создает новую функцию, которая является объединением других функций f(g(x))
  def compose[A,B,C](f: B => C, g: A=>B):A =>C ={
    a => f(g(a))


  }

}
