package why3tests
object TestRandomAccessList{
abstract sealed class ral[A]
final case class Empty[A]()  extends ral[A]
final case class Zero[A] (x1: ral [((A, A))]) extends ral[A]
final case class One[A] (x1: A,x2: ral [((A, A))]) extends ral[A]

def size [a] : (ral [a]) =>  (BigInt) = 
 l => l match{
  case Empty() => BigInt(0)
  case Zero(l1) => (BigInt(2) * (size (l1)))
  case One(_, l1) => (BigInt(1) + (BigInt(2) * (size (l1))))}

def main [xi] : xi =>  xi = 
 green => green

def cons [a] : a => (ral [a]) =>  (ral [a]) = 
 x => l => l match{
  case Empty() => One (x, Empty ())
  case Zero(l1) => One (x, l1)
  case One(y, l1) => Zero ((cons ((x, y))(l1)))}

def lookup [a] : (BigInt) => (ral [a]) =>  a = 
 i => l => l match{
  case Empty() => throw new java.lang.AssertionError
  case One(x,
    l1) =>
    if ((i == BigInt(0)))  x else lookup ((i - BigInt(1)))(Zero (l1))
  case Zero(l1) =>
    {
      val (x0, x1) = lookup ((i / BigInt(2)))(l1) ;
      if (((i % BigInt(2)) == BigInt(0)))  x0 else x1 }}

def tail [a] : (ral [a]) =>  (ral [a]) = 
 l => l match{
  case Empty() => throw new java.lang.AssertionError
  case One(_, l1) => Zero (l1)
  case Zero(l1) =>
    { val (_, x11) = lookup (BigInt(0))(l1) ; One (x11, tail (l1)) }}

def update [a] : (BigInt) => a => (ral [a]) =>  (ral [a]) = 
 i => y => l => l match{
  case Empty() => throw new java.lang.AssertionError
  case One(x,
    l1) =>
    if ((i == BigInt(0)))
     One (y, l1)
    else
      { update ((i - BigInt(1)))(y)(Zero (l1)) match{ 
      case (Empty() | One(_, _)) => throw new java.lang.AssertionError
      case Zero(l11) => One (x, l11)
      }
}
  case Zero(l1) =>
    {
      val (x01, x12) = lookup ((i / BigInt(2)))(l1) ; {
        val l11 =
          update ((i / BigInt(2)))({
            if (((i % BigInt(2)) == BigInt(0)))  (y, x12) else (x01, y) })(l1) ;
        Zero (l11) } }}

}
