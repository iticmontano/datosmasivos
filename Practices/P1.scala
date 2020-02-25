// Assessment 1/Practica 1
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
    println(s"Estoy escribiendo un $bird")

//4. Given the variable message = "Hi Luke, I'm your father!" use slilce to extract the
// sequence "Luke"
    var message = "Hi Luke, I'm your father!"
    message slice(3,7)

//5. What is the difference in value and a variable in scala?
    the valie is immutable and the variable can change in value
// 6. Given the tuple ((2,4,5), (1,2,3), (3,114,23)), return the number 3.1416
    val tup = ((2,4,5),(1,2,3),(3.1416,23))
    println(tup._3._1)
