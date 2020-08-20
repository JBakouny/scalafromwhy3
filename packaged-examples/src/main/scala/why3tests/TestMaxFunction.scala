package why3tests
object TestMaxFunction{
def max (a: BigInt) (b: BigInt) : BigInt = { if ((a > b))  a else b}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(5) ;
  val actual = max (BigInt(1)) (BigInt(5)) ;
  if ((actual == expected))  green else BigInt(0)}

}
