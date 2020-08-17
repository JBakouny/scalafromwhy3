package why3
object test_pattern{
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

val exp = { val x = BigInt(1) ; val y = BigInt(2) ; (x + y) }

val x = BigInt(4)

val y = (x + BigInt(1))

def f (x1: BigInt) : BigInt = { (x1 + BigInt(1))}

def tm (t: (BigInt, BigInt)) : BigInt = {
  val z = BigInt(5) ; val (x3, y1) = t ; ((x3 + y1) + z)}

}
