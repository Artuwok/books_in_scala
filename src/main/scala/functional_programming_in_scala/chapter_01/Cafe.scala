package functional_programming_in_scala.chapter_01



// Scala program with side effects

/*class Cafe {

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    (cup, Charge(cc, cup.price))
  }

  def buyCoffees(cc: CreditCard, n: int): (List[Coffee], Charge) = {

    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
  }
}


case class Charge(cc: CreditCard, amount: Double) {

  def combine(other: Charge): Charge = {
    if (cc == other.cc) {
      Charge(cc, amount + other.amount)
    }
    else throw new IllegalArgumentException("Can combine two different cards")
  }

  def coalesce(charges: List[Charge]): List[Charge] =
    charges.groupBy(_.cc).values.map(_.reduce(_ combine _)).toList
}*/


