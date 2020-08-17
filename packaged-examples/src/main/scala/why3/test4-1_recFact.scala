packaged why3
object main{
def fact (x: BigInt) : BigInt = {
  if (x <= BigInt(1))
   BigInt(1)
  else { val o = fact ((x - BigInt(1))) ; (x * o) }}

}
