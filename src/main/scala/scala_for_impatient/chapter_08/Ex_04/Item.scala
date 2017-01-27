package scala_for_impatient.chapter_08.Ex_04

// Define an abstract class Item with methods price and description . A SimpleItem is an item whose
// price and description are specified in the constructor. Take advantage of the fact that a val can
// override a def . A Bundle is an item that contains other items. Its price is the sum of the prices in
// the bundle. Also provide a mechanism for adding items to the bundle and a suitable description
// method.

abstract class Item {
  def price: Double

  def description: String
}

class SimpleItem(val price: Double, val description: String) extends Item {

}

class Bundle(var items: Array[Item]) extends Item {

  def add(x: Item): Array[Any] = {
    items ++ Array(x)
  }

  override def price: Double = items.map(_.price).sum

  override def description: String = {
    val desc = for (item <- items) yield {
      item.description
    }
    desc.mkString(", ")
  }
}
