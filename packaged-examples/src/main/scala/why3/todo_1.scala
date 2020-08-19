package why3
object todo_1{
def f [xi, xi1] : xi => xi1 =>  xi = 
 x => y => x

def h [xi2, xi3] : xi2 =>  (xi3 => xi2) = 
 a => f (a)

}
