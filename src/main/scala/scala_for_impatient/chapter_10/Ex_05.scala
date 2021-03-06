/*
package scala_for_impatient.chapter_10

import java.beans.PropertyChangeSupport

/** The JavaBeans specification has the notion of a property change listener, a standardized way
  * for beans to communicate changes in their properties. The PropertyChangeSupport class is provided
  * as a convenience superclass for any bean that wishes to support property change listeners.
  * Unfortunately, a class that already has another superclass—such as JComponent —must reimplement
  * the methods. Reimplement PropertyChangeSupport as a trait, and mix it into the java.awt.Point class. */

object Ex_05 {

  val z = new java.awt.Point() with PropertyChangeSupportAdapter

  z.fireIndexedPropertyChange()

}

trait PropertyChangeSupportAdapter extends PropertyChangeSupport {


}
*/
