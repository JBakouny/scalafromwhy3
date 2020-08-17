packaged why3tests
object TestIdFunction{
def f [xi] : xi =>  xi = 
 a => a

def idmain (_: Unit) : BigInt = {
  val expected = BigInt(3) ;
  val actual = f (BigInt(3)) ;
  if (actual == expected)  BigInt(1) else BigInt(0)}

}
