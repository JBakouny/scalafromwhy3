package why3
object Main{
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

def f [xi, xi1, xi2] : xi => xi1 => xi2 =>  xi = 
 x => y => z => x

def g [xi3, xi4] : xi3 =>  (tree [xi4]) = 
 x => f (Empty ()) (Cons (BigInt(2), Nil ())) (Some (x))

val a = BigInt(5)

def h [xi5, xi6] : xi5 =>  (tree [xi6]) = 
 a1 => g (a1)

def f2 [xi7, xi8] : xi7 => xi8 =>  (option2 [xi7, xi8]) = 
 a1 => b => Some2 (a1, b)

}