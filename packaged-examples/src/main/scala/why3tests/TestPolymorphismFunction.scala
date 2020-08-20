package why3tests
object TestPolymorphismFunction{
def f [xi, xi1] : xi => xi1 =>  xi = 
 x => y => x

def f1 [xi2, xi3, xi4] : xi2 => xi3 => xi4 =>  xi4 = 
 x => y => z => z

def main (green: BigInt) : BigInt = {
  val expected = BigInt(6) ;
  val actual = f1 (BigInt(8)) (BigInt(7)) (BigInt(6)) ;
  if ((actual == expected))  green else BigInt(0)}

}
