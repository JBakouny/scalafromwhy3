package fr.lri.why3

// Translated from Sect. 2.6 of Why3 Manual
object AmortizedQueue {
  case class Queue[A](val front: List[A], val lenf: Int,
                      val rear: List[A], val lenr: Int)

  def sequence[A](q: Queue[A]): List[A] =
    q.front ++ q.rear.reverse

  def empty[A]: Queue[A] =
    Queue[A](front = Nil, lenf = 0, rear = Nil, lenr = 0)

  def head[A](q: Queue[A]): A = {
    val x :: _ = q.front
    x
  }

  def create[A](f: List[A])(lf: Int)(r: List[A])(lr: Int): Queue[A] =
    if (lf >= lr)
      Queue[A](front = f, lenf = lf, rear = r, lenr = lr)
    else {
      lazy val f: List[A] = f ++ r.reverse
      // lazy ou renommage comme workaround, voir: https://stackoverflow.com/questions/13328502/what-does-forward-reference-extends-over-definition-of-value-mean-in-scala/13328947
      Queue[A](front = f, lenf = lf + lr, rear = Nil, lenr = 0)
    }

  def tail[A](q: Queue[A]): Queue[A] = {
    val _ :: r = q.front
    create(r)(q.lenf - 1)(q.rear)(q.lenr)
  }

  def enqueue[A](x: A)(q: Queue[A]): Queue[A] =
    create(q.front)(q.lenf)(x :: q.rear)(q.lenr + 1)
}
