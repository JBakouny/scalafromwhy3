package searching.linked.list

object SearchingALinkedList {

  def search(i: Int)(l: List[Int]): Int =
    l match {
      case Nil    => i
      case x :: r => if (x == 0) i else search(i + 1)(r)
    }                                             //> search: (i: Int)(l: List[Int])Int

  def search_list(l: List[Int]): Int = search(0)(l)
                                                  //> search_list: (l: List[Int])Int
}