package amortized.queue

object AmortizedQueueAlt {
  case class Queue[A](val front: List[A], val lenf: Int,
                      val rear: List[A], val lenr: Int)

  def sequence[A](q: Queue[A]): List[A] =
    q.front ++ q.rear.reverse                     //> sequence: [A](q: amortized.queue.AmortizedQueueAlt.Queue[A])List[A]

  def empty[A]: Queue[A] =
    Queue[A](front = Nil, lenf = 0, rear = Nil, lenr = 0)
                                                  //> empty: [A]=> amortized.queue.AmortizedQueueAlt.Queue[A]

  def head[A](q: Queue[A]): A =
    {
      val x :: _ = q.front
      x
    }                                             //> head: [A](q: amortized.queue.AmortizedQueueAlt.Queue[A])A

  def create[A](f: List[A])(lf: Int)(r: List[A])(lr: Int): Queue[A] =
    if (lf >= lr)
      Queue[A](front = f, lenf = lf, rear = r, lenr = lr)
    else {
      lazy val f: List[A] = f ++ r.reverse // lazy ou renommage comme workaround, voir: https://stackoverflow.com/questions/13328502/what-does-forward-reference-extends-over-definition-of-value-mean-in-scala/13328947
      Queue[A](front = f, lenf = lf + lr, rear = Nil, lenr = 0)
    }                                             //> create: [A](f: List[A])(lf: Int)(r: List[A])(lr: Int)amortized.queue.Amortiz
                                                  //| edQueueAlt.Queue[A]

  def tail[A](q: Queue[A]): Queue[A] = {
    val _ :: r = q.front
    create(r)(q.lenf - 1)(q.rear)(q.lenr)
  }                                               //> tail: [A](q: amortized.queue.AmortizedQueueAlt.Queue[A])amortized.queue.Amor
                                                  //| tizedQueueAlt.Queue[A]

  def enqueue[A](x: A)(q: Queue[A]): Queue[A] =
    create(q.front)(q.lenf)(x :: q.rear)(q.lenr + 1)
                                                  //> enqueue: [A](x: A)(q: amortized.queue.AmortizedQueueAlt.Queue[A])amortized.
                                                  //| queue.AmortizedQueueAlt.Queue[A]
  
}