package why3tests
object TestRecFactFunction{
def fact (x: BigInt) : BigInt = {
  if ((x <= BigInt(1)))
   BigInt(1)
  else { val o = fact ((x - BigInt(1))) ; (x * o) }}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(6) ;
  val actual = fact (BigInt(3)) ;
  if ((actual == expected))  green else BigInt(0)}

}
