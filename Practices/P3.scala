//first method: this version uses recursion
//Recursion only works well if n is small, otherwise you get a stack overflow exception.
def fib1( n : Int) : Int = n match {
   case 0 | 1 => n
   case _ => fib1( n-1 ) + fib1( n-2 )
}

//second method: this problem uses a loop
def fib2( n : Int ) : Int = {
  var a = 0
  var b = 1
  var i = 0	  
 
  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  } 
  return a
}

//third method: this method uses so-called tail-recursion
def fib3( n : Int) : Int = { 
  def fib_tail( n: Int, a:Int, b:Int): Int = n match {
    case 0 => a 
    case _ => fib_tail( n-1, b, a+b )
  }
  return fib_tail( n, 0, 1)
}

//fourth method
def fib4( n : Int) : Int = { 
  def fib_tail( n: Int, a:Int, b:Int): Int = n match {
    case 0 => a 
    case _ => fib_tail( n-1, b, (a+b)%1000000 )
  }
  return fib_tail( n, 0, 1)
}

//fifth method
def fib5( n : Int) : Int = { 
  def fib_tail( n: Int, a:Int, b:Int): Int = n match {
    case 0 => a 
    case _ => fib_tail( n-1, b, (a+b)%1000000 )
  }
  return fib_tail( n%1500000, 0, 1)
}