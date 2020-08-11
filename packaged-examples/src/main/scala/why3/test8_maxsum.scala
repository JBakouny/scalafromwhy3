package why3
object Main{
def max_sum (a: Array[(BigInt)]) (n: BigInt) : (BigInt, BigInt) = {
  var sum = BigInt(0) ;
  var max = BigInt(0) ;
  {
    val o = (n - BigInt(1)) ; val o1 = BigInt(0) ;
    for (i <- o1 to o by 1) {
      if ((max < (a(i.toInt)))) max = a(i.toInt); sum = (sum + (a(i.toInt)))
      } };
  (sum, max)}

}
