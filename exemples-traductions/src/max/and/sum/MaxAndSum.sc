package max.and.sum

object MaxAndSum {

	def max_sum(a : Array[Int])(n : Int) : (Int, Int) = {
		var sum = 0
		var max = 0
		for (i <- 0 to n-1) {
			if (max < a(i)) {
				max = a(i)
				sum = sum + a(i)
			}
		}
		(sum, max)
	}                                         //> max_sum: (a: Array[Int])(n: Int)(Int, Int)
	
}