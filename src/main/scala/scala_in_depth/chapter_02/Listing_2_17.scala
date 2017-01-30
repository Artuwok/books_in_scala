package scala_in_depth.chapter_02

import java.io.File

/** Creating an object or returning a default */
object Listing_2_17 {

  def getTemporaryDirectory(tmpDir: Option[String]): java.io.File = {
    tmpDir.map(name => new java.io.File(name))
      .filter(_.isDirectory)
      .getOrElse(new File(System.getProperty("java.io.tmpdir")))
  }

}
