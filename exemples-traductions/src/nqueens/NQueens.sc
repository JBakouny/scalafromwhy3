package nqueens

object NQueens {

	final case class Inconsistent(q : Int) extends Exception

	def check_is_consistent(board : Array[Int]) (pos: Int) : Boolean =
		try {
			for (q <- 0 to pos-1) {
				val bq = board(q)
				val bpos = board(pos)
				if (bq == bpos) {
					throw Inconsistent(q)
				}
				if (bq - bpos == pos - q) {
					throw Inconsistent(q)
				}
				if (bpos - bq == pos - q) {
					throw Inconsistent(q)
				}
			}
			true
		} catch {
			case Inconsistent(q) => false
		}                                 //> check_is_consistent: (board: Array[Int])(pos: Int)Boolean
		
		final case object Solution extends Exception
		
		def bt_queens(board : Array[Int])(n : Int) (pos: Int)
		{
			if  (pos == n) {
				throw Solution
			}
			for (i <- 0 to n - 1) {
				board(pos) = i;
				if (check_is_consistent(board)(pos)) {
					bt_queens(board)(n)(pos+1)
				}
			}
		}                                 //> bt_queens: (board: Array[Int])(n: Int)(pos: Int)Unit
		def queens(board : Array[Int])(n : Int)
		{
		  bt_queens(board)(n)(0)
	  }                                       //> queens: (board: Array[Int])(n: Int)Unit
		
}