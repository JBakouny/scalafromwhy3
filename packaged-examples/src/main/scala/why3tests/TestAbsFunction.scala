packaged why3tests
object TestAbsFunction{
def abs (x: BigInt) : BigInt = { if (x < BigInt(0))  x else x}

def absmain (_: Unit) : BigInt = {
  val expected = BigInt(8) ;
  val actual = abs (BigInt(-8)) ;
  if (actual == expected)  BigInt(1) else BigInt(0)}

}
