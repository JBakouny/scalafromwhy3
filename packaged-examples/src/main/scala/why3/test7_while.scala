package why3
object test7_while{
def count_to (lim: BigInt) : BigInt = {
  var i = BigInt(0) ; while ((i < lim)) { i = (i + BigInt(1))  }; i}

}
