package why3tests
object TestLetRefFunction{
def main (green: BigInt) : BigInt = {
  val x = BigInt(1) ;
  var y = BigInt(0) ;
  val expected = x ;
  val actual = (y + BigInt(1)) ;
  if ((actual == expected))  green else BigInt(0)}

}
