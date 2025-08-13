fun main (){
    var x = 105
    val y = 10f

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")
    println("x+y*8 = ${x+y*8}")

    var result = x + y
    println("result = $result")
    result +=  2
    println ("result = $result")

    x = 0
    println("x++ ${x++}")
    println("++x ${++x}")
    println("x-- = ${x--}")
    println("--x = ${--x}")

}