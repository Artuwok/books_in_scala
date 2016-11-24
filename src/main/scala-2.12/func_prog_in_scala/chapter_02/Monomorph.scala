package func_prog_in_scala.chapter_02

//example of monomorphic function
object Monomorph {

  def main(args: Array[String]): Unit = {
    println(findFirst(Array("ss", "zz", "yy"), "yy"))
  }

  def findFirst(ss: Array[String], key: String) = {

    def loop(i: Int): Int = {

      if (i >= ss.length) -1
      else if (ss(i) == key) i

      else loop(i + 1)
    }
    loop(0)
  }
}
