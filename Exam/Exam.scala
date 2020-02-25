// //Declarar la Tupla con la matriz
// val arr4 = ((11, 2, 4), (4, 5, 6), (10, 8, -12)) 
// // res0: arr4: ((Int, Int, Int), (Int, Int, Int), (Int, Int, Int)) = ((11,2,4),(4,5,6),(10,8,-12))

// //Declarar las variables con las operaciones de las diagonales de la matriz
// val diagonal_1: Int = (arr4._1._1) + (arr4._2._2) + (arr4._3._3) // res1: Int = 4
// val diagonal_2: Int = (arr4._1._3) + (arr4._2._2) + (arr4._3._1) // res2: Int = 19

// //Aplicar la funcion para calcular el valor absoluto donde en una variable se guardara evaluara la diferencia 
// //de las diagonales y se agrega el ".abs" para calcular al absoluto
// def diagonalDefference(arr:Int): Int = {
//     val arr = (diagonal_1 - diagonal_2).abs
//     arr
// }
// //para mostrar el resultado
// println(diagonalDefference(arr))

//Opcion 2
val arr4 = ((11, 2, 4), (4, 5, 6), (10, 8, -12))
val diagonal_1: Int = (arr4._1._1) + (arr4._2._2) + (arr4._3._3)
val diagonal_2: Int = (arr4._1._3) + (arr4._2._2) + (arr4._3._1)
def diagonalDefference(a:Int, b:Int): Int = (a - b).abs
diagonalDefference(diagonal_1,diagonal_2)