package scala_for_impatient.chapter_04

import java.util.Properties

import scala.collection.JavaConverters._
import scala.collection.mutable

// Print a table of all Java properties, like this:
object Ex_07 extends App {

  val props: Properties = System.getProperties
  val propsScala: mutable.Map[String, String] = props.asScala
  val padding = " "
  var lenght = 0

  for ((k, v) <- propsScala) if (k.length > lenght) lenght = k.length else lenght
  for ((k, v) <- propsScala) println(k + padding * (lenght - k.length - 1) + "| " + v)


}
