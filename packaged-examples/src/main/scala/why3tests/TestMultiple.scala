packaged why3tests
object TestMultiple{
def mult (x: BigInt) (y: BigInt) : BigInt = { (x * y)}

def squaremain (_: Unit) : BigInt = {
  val expected = BigInt(25) ;
  val actual = mult (BigInt(5)) (BigInt(5)) ;
  if (actual == expected)  BigInt(1) else BigInt(0)}

}
