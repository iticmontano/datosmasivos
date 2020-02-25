//Opcion 2
//Declarar la Variable con la matriz
val arr4 = ((11, 2, 4), (4, 5, 6), (10, 8, -12))
//Declaras variables con ls operaciones de las diagonales
val diagonal_1: Int = (arr4._1._1) + (arr4._2._2) + (arr4._3._3)
val diagonal_2: Int = (arr4._1._3) + (arr4._2._2) + (arr4._3._1)
//funcion para determinar el valor absoluto de las diagonales
def diagonalDefference(a:Int, b:Int): Int = (a - b).abs
//llamar la fincion con la operacion
diagonalDefference(diagonal_1,diagonal_2)