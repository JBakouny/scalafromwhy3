package why3tests
object TestAbsFunction{
def abs (x: BigInt) : BigInt = { if (x < BigInt(0))  -x else x}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(8) ;
  val actual = abs (BigInt(-8)) ;
  if (actual == expected)  green else BigInt(0)}
}
