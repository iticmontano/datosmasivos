//Declare variable with the matrix
val arr4 = ((11, 2, 4), (4, 5, 6), (10, 8, -12))
//Declare variable with the operations of the both diagonals
val diagonal_1: Int = (arr4._1._1) + (arr4._2._2) + (arr4._3._3)
val diagonal_2: Int = (arr4._1._3) + (arr4._2._2) + (arr4._3._1)
//function to calculate the absolut value
def diagonalDefference(a:Int, b:Int): Int = (a - b).abs
//call the function
diagonalDefference(diagonal_1,diagonal_2)