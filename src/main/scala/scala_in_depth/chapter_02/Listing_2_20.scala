package scala_in_depth.chapter_02

import java.sql.{Connection, DriverManager}

/** Merging options */
object Listing_2_20 {

  def conncectionManager(conUrl: Option[String], user: Option[String], password: Option[String]): Option[Connection] = {
    for (c <- conUrl; u <- user; p <- password) yield DriverManager.getConnection(c, u, p)
  }
}
