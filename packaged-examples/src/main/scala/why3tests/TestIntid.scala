package why3tests
object TestIntid{
def intid (x: BigInt) : BigInt = { x}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(6) ;
  val actual = intid (BigInt(6)) ;
  if ((actual == expected))  green else BigInt(0)}

}
