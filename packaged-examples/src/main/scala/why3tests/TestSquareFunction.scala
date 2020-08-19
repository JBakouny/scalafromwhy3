package why3tests
object TestSquareFunction{
def square (x: BigInt) : BigInt = { (x * x)}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(25) ;
  val actual = square (BigInt(5)) ;
  if ((actual == expected))  green else BigInt(0)}

}
