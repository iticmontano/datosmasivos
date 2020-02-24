// Assessment 1/Practica 1
//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
    //Declarar la operacion de 2(pi) dentro de un value "radio"
        val radio:Int = 2*3.1415926535
    //realizar una operacion
        16/radio //res0: 2.568991

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo
    def isPrime(num:Int): Boolean = {
    for(n <- Range(2, num)){
        if(num%n == 0){
            return false
            }
        }
    return true
    }
    println(isPrime(10))
//3. Dada la variable bird = "tweet", utiliza interpolacion de string para
//   imprimir "Estoy ecribiendo un tweet"
    val bird = "tweet"
    println(s"Estoy escribiendo un $bird")

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la
//   secuencia "Luke"
    var mensaje = "Hola Luke yo soy tu padre!"
    mensaje slice(5,9)

//5. Cual es la diferencia en value y una variable en scala?
    el valie es inmutable y la variable puede cambiar de valor
//6. Dada la tupla ((2,4,5),(1,2,3),(3.1416,23)) regresa el numero 3.1416 
    val tup = ((2,4,5),(1,2,3),(3.1416,23))
    println(tup._3._1)