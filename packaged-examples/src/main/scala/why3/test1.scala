package why3
object Main{
def f (x: BigInt) : infix_mngt [BigInt, (BigInt, BigInt)] = {
  (y: BigInt) => (x, y)}

def f2 [xi, xi1] : xi => xi1 =>  xi = 
 a => b => a

}