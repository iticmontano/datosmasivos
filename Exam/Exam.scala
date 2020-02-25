//Declare tup with the matrix
val arr = ((11, 2, 4), (4, 5, 6), (10, 8, -12))

//      Calculate the both diagonals sum, saving each one in a variable, 
//      after will calculate the absolute value returning the result.
def diagonalDefference(arr:((Int, Int, Int), (Int, Int, Int), (Int, Int, Int))): Int = {

    val diagonal_1: Int = (arr._1._1) + (arr._2._2) + (arr._3._3)
    val diagonal_2: Int = (arr._1._3) + (arr._2._2) + (arr._3._1)
    var result = (diagonal_1 - diagonal_2).abs
return result
}
//call the function with the result
diagonalDefference(arr)