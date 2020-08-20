package why3tests
object TestBoolean{
def g (a: Boolean) (b: Boolean) (c: Boolean) : Boolean = {
  (a && { (b || c) })}

def main (green: BigInt) : BigInt = {
  val actual = g (true)(false)(true) ; if (actual)  green else BigInt(0)}

}
