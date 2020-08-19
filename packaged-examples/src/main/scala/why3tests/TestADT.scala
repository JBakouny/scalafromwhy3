package why3tests
object TestADT{
abstract sealed class option[A]
final case class None[A]()  extends option[A]
final case class Some[A] (x1: A) extends option[A]

abstract sealed class option2[A, B]
final case class None2[A, B]()  extends option2[A, B]
final case class Some2[A, B] (x1: A,x2: B) extends option2[A, B]

abstract sealed class tree[A]
final case class Empty[A]()  extends tree[A]
final case class NonEmpty[A] (x1: A,x2: tree [A],x3: tree [A]) extends tree[A]

abstract sealed class tree2
final case class Empty2()  extends tree2
final case class NonEmpty2 (x1: BigInt,x2: tree2,x3: tree2) extends tree2

abstract sealed class list[A]
final case class Nil[A]()  extends list[A]
final case class Cons[A] (x1: A,x2: list [A]) extends list[A]

abstract sealed class list2
final case class Nil2()  extends list2
final case class Cons2 (x1: BigInt,x2: list2) extends list2

def head [xi] : (tree [xi]) => xi =>  xi = 
 t => dflt => t match{
  case Empty() => dflt
  case NonEmpty(a, l, r) => a}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(5) ;
  val actual = head (NonEmpty (BigInt(5), Empty (), Empty ())) (BigInt(0)) ;
  if ((actual == expected))  green else BigInt(0)}

}
