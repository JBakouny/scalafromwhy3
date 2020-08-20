package why3tests
object TestMultiple{
def mult (x: BigInt) (y: BigInt) : BigInt = { (x * y)}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(25) ;
  val actual = mult (BigInt(5))(BigInt(5)) ;
  if ((actual == expected))  green else BigInt(0)}

}
