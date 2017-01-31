package scala_in_depth.chapter_03

case class Node(name: String, edges: List[Node]) {

  def search(start: Node, p: Node => Boolean): Option[Node] = {
    def loop(nodeQueue: List[Node], visited: Set[Node]): Option[Node] = nodeQueue match {

      case head :: tail if p(head) => Some(head)
      case head :: tail if !visited.contains(head) =>
        loop(tail ++ head.edges, visited + head)
      case head :: tail => loop(tail, visited)
      case Nil => None
    }

    loop(List(start), Set())
  }
}


