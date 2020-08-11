package why3

// Translated from Sect. 2.4 of Why3 Manual
object SearchingALinkedList {
  def search(i: Int)(l: List[Int]): Int =
    l match {
      case Nil    => i
      case x :: r => if (x == 0) i else search(i + 1)(r)
    }

  def search_list(l: List[Int]): Int = search(0)(l)
}
