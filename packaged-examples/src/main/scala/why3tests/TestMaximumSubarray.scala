package why3tests
object TestMaximumSubarray{
def maximum_subarray (a: Array[(BigInt)]) : BigInt = {
  val n = a.length ;
  var ms = BigInt(0) ;
  {
    val o = (n - BigInt(1)) ; val o1 = BigInt(0) ;
    for (l <- o1 to o by 1) {
      for (h <- l to n by 1) {
        var s = BigInt(0) ;
        {
          val o2 = (h - BigInt(1)) ;
          for (i <- l to o2 by 1) { s += a(i.toInt) } };
        if ((s > ms)) ms = s
        }
      } };
  ms}

def maximum_subarray1 (a: Array[(BigInt)]) : BigInt = {
  val n = a.length ;
  var ms = BigInt(0) ;
  {
    val o = (n - BigInt(1)) ; val o1 = BigInt(0) ;
    for (l1 <- o1 to o by 1) {
      var s = BigInt(0) ;
      val o2 = (l1 + BigInt(1)) ;
      for (h1 <- o2 to n by 1) {
        s += a((h1 - BigInt(1)).toInt); if ((s > ms)) ms = s
        }
      } };
  ms}

def main [xi] : xi =>  xi = 
 green => green

def maximum_subarray_rec (a: Array[(BigInt)]) (l2: BigInt) (h2: BigInt) :
  BigInt = {
  if ((h2 == l2))
   BigInt(0)
  else
    {
      val mid = (l2 + ((h2 - l2) / BigInt(2))) ; var ms = BigInt(0) ;
      var s = ms ;
      {
        val o = (mid - BigInt(1)) ;
        for (i1 <- o to l2 by -1) { s += a(i1.toInt); if ((s > ms)) ms = s } };
      s = ms;
      {
        val o = (h2 - BigInt(1)) ;
        for (i2 <- mid to o by 1) { s += a(i2.toInt); if ((s > ms)) ms = s } };
      {
        val left = maximum_subarray_rec (a)(l2)(mid) ;
        if ((left > ms)) ms = left };
      {
        val right = maximum_subarray_rec (a)((mid + BigInt(1)))(h2) ;
        if ((right > ms)) ms = right };
      ms }}

def maximum_subarray2 (a: Array[(BigInt)]) : BigInt = {
  maximum_subarray_rec (a)(BigInt(0))((a.length))}

def maximum_subarray3 (a: Array[(BigInt)]) : BigInt = {
  val n = a.length ;
  var ms = BigInt(0) ;
  var s = BigInt(0) ;
  {
    val o = (n - BigInt(1)) ; val o1 = BigInt(0) ;
    for (i3 <- o1 to o by 1) {
      if ((s < BigInt(0)))  s = a(i3.toInt) else s += a(i3.toInt);
      if ((s > ms)) ms = s
      } };
  ms}

def maximum_subarray4 (a: Array[(BigInt)]) : BigInt = {
  var maxsum = BigInt(0) ;
  var curmax = BigInt(0) ;
  {
    val o = ((a.length) - BigInt(1)) ; val o1 = BigInt(0) ;
    for (i4 <- o1 to o by 1) {
      curmax += a(i4.toInt);
      if ((curmax < BigInt(0))) curmax = BigInt(0);
      if ((curmax > maxsum)) maxsum = curmax
      } };
  maxsum}

def maximum_subarray5 (a: (Array[(Long)])) : Long = {
  val n = a.length ;
  var ms = 0.toLong  ;
  var s = 0.toLong  ;
  var i5 = 0.toLong  ;
  while (i5 < n) { if (s < 0.toLong )  s = a(i5.toInt) else s += a(i5.toInt);
                   if (s > ms) ms = s;
                   i5 += 1
  
    };
  ms}

}
