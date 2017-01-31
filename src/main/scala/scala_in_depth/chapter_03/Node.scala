package scala_in_depth.chapter_03


/** The help method, called loop, is implemented with a pattern match. The first case
  * pops the first element from the queue of nodes to inspect. It then checks to see if this
  * is the node we are looking for and returns it. The next case statement also pops the
  * first element from the work queue and checks to see if it hasn’t already been visited. If
  * it hasn’t, the node is added to the list of visited nodes and its edges are added to the
  * end of the work queue of nodes. The next case statement is hit when a node has
  * already been visited. This case will continue the algorithm with the rest of the nodes
  * in the queue. The last case statement is hit if the queue is empty. In that case, None is
  * returned indicating no Node was found. */
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


