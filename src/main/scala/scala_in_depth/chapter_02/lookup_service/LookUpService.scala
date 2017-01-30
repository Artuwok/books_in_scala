package scala_in_depth.chapter_02.lookup_service

trait LookUpService[Key, Value] {

  def lookUp(k: Key): Option[Value]

  def insert(k: Key, v: Value): Unit

}
