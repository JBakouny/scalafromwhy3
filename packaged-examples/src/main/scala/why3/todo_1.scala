package why3
object Main{
def f [xi, xi1] : xi => xi1 =>  xi = 
 x => y => x

def h [xi2, xi3] : xi2 =>  (infix_mngt [xi3, xi2]) = 
 a => f (a)

}
