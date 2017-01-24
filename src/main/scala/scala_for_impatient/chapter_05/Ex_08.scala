package scala_for_impatient.chapter_05


// Make a class Car with read-only properties for manufacturer, model name, and model year, and
// a read-write property for the license plate. Supply four constructors. All require the
// manufacturer and model name. Optionally, model year and license plate can also be specified in
// the constructor. If not, the model year is set to -1 and the license plate to the empty string. Which
// constructor are you choosing as the primary constructor? Why?
class Ex_08 {

  class Car(val manufacture: String, val modelName: String, val modelYear: Int, var licensePlate: String) {

    def this(manufacture: String, modelName: String, licensePlate: String) = {
      this(manufacture, modelName, -1, licensePlate)
    }

    def this(manufacture: String, modelName: String, modelYear: Int) = {
      this(manufacture, modelName, modelYear, "")
    }

    def this(manufacture: String, modelName: String) = {
      this(manufacture, modelName, -1, "")
    }
  }
}
