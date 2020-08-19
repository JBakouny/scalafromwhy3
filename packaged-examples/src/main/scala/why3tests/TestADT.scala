package why3tests
object TestADT{
def f (a: BigInt) : BigInt = { (a + BigInt(4))}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(7) ;
  val actual = f (BigInt(3)) ;
  if ((actual == expected))  green else BigInt(0)}

}
