# datosmasivos
Tecnológico nacional de México
 
Instituto tecnológico de Tijuana

Subdirección académica

Departamento de sistemas y computación

Semestre	Enero-Junio 2020

Ingeniería en tecnología de la información y comunicaciones

Datos Masivos (BDD-1704 TI9A) 

Alumnos. Hernández Hernández Marcos José 15211702
         Montaño Pelayo Raul Antonio 15211703

Prof. JOSE CHRISTIAN ROMERO HERNANDEZ	

-----------Unidad 1---------------------

// Practice 1 https://github.com/iticmontano/datosmasivos/blob/unidad1/Practices/P1.scala

//1. Develop an algorithm in scala that calculates the radius of a circle

//2. Develop an algorithm in scala that tells me if a number is a cousin

//3. Given the variable bird = "tweet", use string interpolation to
// print "I am writing a tweet"

//4. Given the variable message = "Hi Luke, I'm your father!" use slilce to extract the
// sequence "Luke"

//5. What is the difference in value and a variable in scala?

// 6. Given the tuple ((2,4,5), (1,2,3), (3,114,23))) return the number 3.1416


````scala
//Practica 1
//1. Develop an algorithm in scala that calculates the radius of a circle
    // Declare the operation of 2 (pi) within a "radius" value
        val radio:Int = 2*3.1415926535
    //realizar una operacion
        16/radio //res0: 2.568991

//2. Develop an algorithm in scala that tells me if a number is a cousin
    def isPrime(num:Int): Boolean = {
    for(n <- Range(2, num)){
        if(num%n == 0){
            return false
            }
        }
    return true
    }
    println(isPrime(10))
//3. Given the variable bird = "tweet", use string interpolation to
// print "I am writing a tweet"
    val bird = "tweet"
    println(s"I am writing a $bird")

//4. Given the variable message = "Hi Luke, I'm your father!" use slilce to extract the
// sequence "Luke"
    var message = "Hi Luke, I'm your father!"
    message slice(3,7)

//5. What is the difference in value and a variable in scala?
    the valie is immutable and the variable can change in value
// 6. Given the tuple ((2,4,5), (1,2,3), (3,114,23)), return the number 3.1416
    val tup = ((2,4,5),(1,2,3),(3.1416,23))
    println(tup._3._1)

````


// Practice 2 https://github.com/iticmontano/datosmasivos/blob/unidad1/Practices/P2.scala

// 1. Create a list called "list" with the elements "red", "white", "black"

// 2. Add 5 more items to "list" "green", "yellow", "blue", "orange", "pearl"

// 3. Bring the "list" "green", "yellow", "blue" items

// 4. Create a number array in the 1-1000 range in 5-in-5 steps

// 5. What are the unique elements of the List list (1,3,3,4,6,7,3,7) use conversion to sets

// 6. Create a mutable map called names containing the following
// "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

// 6 a. Print all map keys

// 7 b. Add the following value to the map ("Miguel", 23)


Exam https://github.com/iticmontano/datosmasivos/blob/unidad1/Exam/Exam.scala

// 1. Declare tup with the matrix

// 2. Calculate the both diagonals sum, saving each one in a variable

// 3. After will calculate the absolute value returning the result.

// 4. call the function with the result

