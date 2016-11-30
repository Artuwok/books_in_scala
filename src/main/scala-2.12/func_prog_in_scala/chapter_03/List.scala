package func_prog_in_scala.chapter_03

sealed trait List[+A]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

case object Nil extends List[Nothing]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }

  //It's generally good practice when pattern matching to use `_` for any variables you don't intend to use on
  // the right hand side of a pattern. This makes it clear the value isn't relevant.
  def tail[A](ds: List[A]): List[A] = ds match {
    case Cons(_, t) => t //
    case Nil => Nil
  }

}
