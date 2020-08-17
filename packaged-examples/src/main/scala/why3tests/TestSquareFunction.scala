packaged why3tests
object TestSquareFunction{
def square (x: BigInt) : BigInt = { (x * x)}

def squaremain (_: Unit) : BigInt = {
  val expected = BigInt(25) ;
  val actual = square (BigInt(5)) ;
  if (actual == expected)  BigInt(1) else BigInt(0)}

}
