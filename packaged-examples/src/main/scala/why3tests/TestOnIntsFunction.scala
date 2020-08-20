package why3tests
object TestOnIntsFunction{
def f (x: BigInt) (y: BigInt) : BigInt = { (x + y)}

def g (x: BigInt) (y: BigInt) : BigInt = { (x - y)}

def h (x: BigInt) : BigInt = { (-x)}

def i (x: BigInt) (y: BigInt) : BigInt = { (x * y)}

def lessthan (x: BigInt) (y: BigInt) : Boolean = { (x < y)}

def main (green: BigInt) : BigInt = {
  val expected = BigInt(0) ;
  val actual = g (BigInt(2)) (BigInt(2)) ;
  if ((actual == expected))  green else BigInt(0)}

}
