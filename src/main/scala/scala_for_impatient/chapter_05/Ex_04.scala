package scala_for_impatient.chapter_05

// Reimplement the Time class from the preceding exercise so that the internal representation is the
// number of minutes since midnight (between 0 and 24 × 60 – 1). Do not change the public
// interface. That is, client code should be unaffected by your change.

class Ex_04 {

  class Time(val hours: Int, val minutes: Int) {

    if (hours < 0 || hours > 23) throw new IllegalArgumentException
    if (minutes < 0 || minutes > 59) throw new IllegalArgumentException

    private val minutesSinceMid = hours * 60 + minutes

    def before(other: Time): Boolean = if (minutesSinceMid > other.minutesSinceMid) true else false
  }

}
