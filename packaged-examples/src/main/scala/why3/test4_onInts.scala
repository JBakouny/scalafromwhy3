packaged why3
object main{
def f (x: BigInt) (y: BigInt) : BigInt = { (x + y)}

def g (x: BigInt) (y: BigInt) : BigInt = { (x - y)}

def h (x: BigInt) : BigInt = { (-x)}

def i (x: BigInt) (y: BigInt) : BigInt = { (x * y)}

def lessthan (x: BigInt) (y: BigInt) : Boolean = { (x < y)}

}
