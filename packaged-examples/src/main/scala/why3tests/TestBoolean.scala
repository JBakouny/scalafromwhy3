packaged why3tests
object TestBoolean{
def g (a: Boolean) (b: Boolean) (c: Boolean) : Boolean = {
  (a && { (b || c) })}

def boolmain (_: Unit) : BigInt = {
  val actual = g (true) (false) (true) ; if actual  BigInt(1) else BigInt(0)}

}
