package why3tests
object TestIdFunction{
def f [xi] : xi =>  xi = 
 a => a

def main (green: BigInt) : BigInt = {
  val expected = BigInt(3) ;
  val actual = f (BigInt(3)) ;
  if (actual == expected)  green else BigInt(0)}

}
