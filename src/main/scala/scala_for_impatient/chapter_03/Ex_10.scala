package scala_for_impatient.chapter_03

import java.awt.datatransfer._

import scala.collection.JavaConverters.asScalaBuffer
import scala.collection.mutable

// Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
// the call val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
// Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
// and get the return value as a Scala buffer. (Why this obscure class? It’s hard
// to find uses of java.util.List in the standard Java library.)
object Ex_10 extends App {
  val flavors: SystemFlavorMap = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val scalaBuf: mutable.Buffer[String] = asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
}
