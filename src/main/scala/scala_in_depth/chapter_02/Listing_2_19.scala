package scala_in_depth.chapter_02

/** Executing code if several options are defined */
object Listing_2_19 extends App {

  def authentificationSession(session: HttpSession, userName: Option[String], password: Option[Array[Char]]): Unit = {

    for (u <- userName;
         p <- password

         if canUthentificate(u, p)) {
      val privileges = PreveligiesFor(u)
      injectPreviligiesIntoSession(session, privileges)
    }
  }
}
