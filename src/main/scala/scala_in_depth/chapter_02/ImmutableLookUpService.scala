package scala_in_depth.chapter_02

// Better implementation since we are locking only when writing to map
class ImmutableLookUpService[Key, Value] extends LookUpService[Key, Value] {

  var currentIndex = new collection.immutable.HashMap[Key, Value]
  override def lookUp(k: Key): Option[Value] = currentIndex.get(k)
  override def insert(k: Key, v: Value): Unit = {
    synchronized(currentIndex += ((k, v)))
  }
}
