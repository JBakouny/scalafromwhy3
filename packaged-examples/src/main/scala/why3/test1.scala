package why3
object test1{
def f (x: BigInt) : (BigInt) => ((BigInt, BigInt)) = { (y: BigInt) => (x, y)}

def f2 [xi, xi1] : xi => xi1 =>  xi = 
 a => b => a

}
