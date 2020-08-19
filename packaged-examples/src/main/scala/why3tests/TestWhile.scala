package why3tests
object TestWhile{
def count_to (lim: BigInt) : BigInt = {
  var i = BigInt(0) ; while ((i < lim)) { i = (i + BigInt(1))  }; i}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(5) ;
  val actual = count_to (BigInt(5)) ;
  if ((actual == expected))  green else BigInt(0)}

}
