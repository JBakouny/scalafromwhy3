package why3

// Translated from Sect. 2.2 of Why3 Manual
object MaxAndSum {
  def max_sum(a: Array[Int])(n: Int): (Int, Int) = {
    var sum = 0
    var max = 0
    for (i <- 0 to n - 1) {
      if (max < a(i)) {
        max = a(i)
      }
      sum = sum + a(i)
    }
    (sum, max)
  }

  // test
  def main(args: Array[String]) {
    val a = Array(9,5,0,2,7,3,2,1,10,6);
    val (s,m) = max_sum(a)(10);
    assert(s == 45);
    assert(m == 10);
    print("OK\n")
  }


}
