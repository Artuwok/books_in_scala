package functional_programming_in_scala.chapter_03

import scala.annotation.tailrec

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
  //the right hand side of a pattern. This makes it clear the value isn't relevant.
  def tail[A](ds: List[A]): List[A] = ds match {
    case Cons(_, t) => t //
    case Nil => throw new IllegalArgumentException("List is empty! Cannot take tail")
  }

  //EXERCISE 3.3
  def setHead[A](l: A, ds: List[A]): List[A] = ds match {
    case Cons(_, t) => Cons(l, t)
    case Nil => sys.error("setHead on empty list")
  }

  //EXERCISE 3.4
  //Generalize tail to the function drop , which removes the first n elements from a list.
  //Note that this function takes time proportional only to the number of elements being
  //dropped—we don’t need to make a copy of the entire List .

  @tailrec
  def drop[A](l: List[A], n: Int): List[A] =
    if (n <= 0) l else
      l match {
        case Cons(_, t) => drop(t, n - 1)
        case Nil => sys.error("Empty list")
      }

  //EXERCISE 3.5
  //Implement dropWhile, which removes elements from the List prefix as long as they
  //match a predicate.

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Cons(h, t) if f(h) => dropWhile(t, f)
    case _ => l
  }

  //EXERCISE 3.6
  // Implement a function, init , that returns a List
  // consisting of all but the last element of a List . So, given List(1,2,3,4) , init will
  // return List(1,2,3) . Why can’t this function be implemented in constant time like  tail?

  def init[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(_, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = as match {

    case Cons(x, xs) => f(x, foldRight(xs, z)(f))
  }


  //EXERCISE 3.9
  //Compute the length of a list using foldRight.
  def length[A](as: List[A]): Int =
  foldRight(as, 0)((_, acc) => acc + 1)

  //EXERCISE 3.10
  //write another general list-recursion function, foldLeft , that is tail-recursive
  @tailrec
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Nil => z
    case Cons(h, t) => foldLeft(t, f(z, h))(f)
  }

  //EXERCISE 3.11
  // Write sum , product , and a function to compute the length of a list using foldLeft.

  def sumWithFoldLeft(ints: List[Int]): Int =
    foldLeft(ints, 0)(_ + _)

  def productWithFoldLeft(ds: List[Double]): Double =
    foldLeft(ds, 1.0)(_ * _)

  def ComputeLength[A](l: List[A]): Int =
    foldLeft(l, 0)((acc, _) => acc + 1)

  //EXERCISE 3.12
  //Write a function that returns the reverse of a list (given List(1,2,3) it returns
  //List(3,2,1) ). See if you can write it using a fold.

  def reverse[A](l: List[A]): List[A] =
    foldLeft(l, List[A]())((acc, h) => Cons(h, acc))

  //EXERCISE 3.14
  //Implement append in terms of either foldLeft or foldRight.
  def append[A](l: List[A], r: List[A]): List[A] = {
    foldRight(l, r)(Cons(_, _))
  }


  // EXERCISE 3.16
  // Write a function that transforms a list of integers by adding 1 to each element.
  // (Reminder: this should be a pure function that returns a new List !)

/*  def transform[Int](l: List[Int]): List[Int] = l match {
    case (h, t) => foldRight(t, h)
  }*/



}
