package scala_for_impatient.chapter_05


// Write a class Time with read-only properties hours and minutes and a method before(other: Time):
//Boolean that checks whether this time comes before the other. A Time object should be constructed
//as new Time(hrs, min) , where hrs is in military time format (between 0 and 23).


class Ex_03 {

  class Time(val hours: Int, val minutes: Int) {

    if (hours < 0 || hours > 23) throw new IllegalArgumentException
    if (minutes < 0 || minutes > 59) throw new IllegalArgumentException

    def before(other: Time): Boolean = {
      if (hours > other.hours || (hours == other.hours) && (minutes > other.minutes)) true else false
    }
  }
}
