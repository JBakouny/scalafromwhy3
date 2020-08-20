package why3tests
object TestFunction1{
def f (x: BigInt) : (BigInt) => ((BigInt, BigInt)) = { (y: BigInt) => (x, y)}

def f2 [xi, xi1] : xi => xi1 =>  xi = 
 a => b => a

def main (green: BigInt) : BigInt = {
  val expected = BigInt(6) ;
  val actual = f2 (BigInt(6))(BigInt(7)) ;
  if ((actual == expected))  green else BigInt(0)}

}
