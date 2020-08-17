packaged why3tests
object TestFactorialFunction{
def factorial (x: BigInt) : BigInt = {
  if (x <= BigInt(1))
   BigInt(1)
  else { val o = factorial ((x - BigInt(1))) ; (x * o) }}

def factmain (_: Unit) : BigInt = {
  val expected = BigInt(120) ;
  val actual = factorial (BigInt(5)) ;
  if (actual == expected)  BigInt(1) else BigInt(0)}

}
