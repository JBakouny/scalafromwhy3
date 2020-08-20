package why3tests
object TestSum{
def sum (a: BigInt) (b: BigInt) (c: BigInt) : BigInt = { ((a + b) + c)}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(6) ;
  val actual = sum (BigInt(2)) (BigInt(2)) (BigInt(2)) ;
  if ((actual == expected))  green else BigInt(0)}

}
