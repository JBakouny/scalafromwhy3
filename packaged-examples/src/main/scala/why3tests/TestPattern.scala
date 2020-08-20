package why3tests
object TestPattern{
def tm (t: (BigInt, BigInt)) : BigInt = {
  val z = BigInt(5) ; val (x, y) = t ; ((x + y) + z)}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(14) ;
  val actual = tm ((BigInt(4), BigInt(5))) ;
  if ((actual == expected))  green else BigInt(0)}

}
