package scala_in_depth.chapter_02.lookup_service

import scala.collection.mutable.{HashMap => MutableHash}

// Not the best implementation since we are locking on every read and write
class MutableLookUpService[Key, Value] extends LookUpService[Key, Value] {

  val currentIndex = new MutableHash[Key, Value]
  override def lookUp(k: Key): Option[Value] = synchronized(currentIndex.get(k))
  override def insert(k: Key, v: Value): Unit = synchronized(currentIndex.put(k, v))
}
