package why3
object test_com{
def count_to (lim: BigInt) : BigInt = {
  var i = BigInt(0);
  while ((i < lim)) {
    i = (i + BigInt(1)); i
  }
  i
}

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

def search (i: BigInt) (l: list [(BigInt)]) : BigInt = {
  l match{
  case Nil() => i
  case Cons(x, r) => if (x == BigInt(0))  i else search ((i + BigInt(1))) (r)}}

def search2 (i: BigInt) (l: list2) : BigInt = {
  l match{
  case Nil2() => i
  case Cons2(x,
    r) =>
    if (x == BigInt(0))  i else search2 ((i + BigInt(1))) (r)}}

def test_pat (xs: list [(BigInt)]) : BigInt = {
  xs match{
  case Nil() => BigInt(0)
  case Cons(x, (Cons(_, Nil()) | Nil())) => x
  case Cons(x, (x2 @ Cons(y, ys))) => { val o = test_pat (x2) ; (x + o) }}}

def tm (t: (BigInt, BigInt)) : BigInt = {
  val z = BigInt(5) ; val (x, y) = t ; ((x + y) + z)}

def f1 (x1: BigInt) : BigInt => (BigInt, BigInt) = {
  (y1: BigInt) => (x1, y1)}

def f2 [xi] : xi =>  xi = 
 a => a

val exp = { val x3 = BigInt(1) ; val y2 = BigInt(2) ; (x3 + y2) }

val x3 = BigInt(4)

val y2 = (x3 + BigInt(1))

def f3 (x4: BigInt) : BigInt = { (x4 + BigInt(1))}

def f4 [xi1, xi2, xi3] : xi1 => xi2 => xi3 =>  xi1 = 
 x4 => y3 => z => x4

//def g [xi4, xi5] : xi4 =>  (tree [xi5]) =
// x4 => f4 (Empty ()) (Cons (BigInt(2), Nil ())) (Some (x4))

val a = BigInt(5)

//def h [xi6, xi7] : xi6 =>  (tree [xi7]) =
// a1 => g (a1)

def f5 (a1: list [(BigInt)]) : list [(BigInt)] = { Cons (BigInt(1), a1)}

def f6 [xi8, xi9] : xi8 => xi9 =>  (option2 [xi8, xi9]) = 
 a1 => b => Some2 (a1, b)

def j [xi10, xi11] : xi10 => xi11 =>  ((xi10, xi11)) = 
 x4 => y3 => (x4, y3)

}
