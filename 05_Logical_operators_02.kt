import com.sun.tools.javac.Main

fun main (){

    println("ENTER THE NUMBER a :")
    val a = readln().toInt()

    println("ENTER THE NUMBER b :")
    val b = readln().toInt()

    if ((a < 0 && b < 0)||(a > 0 && b > 0)){
        println(" product will be a positive integer")

    }
    else if ((a < 0 && b > 0)||(a > 0 && b < 0)){
        println(" product will be a negative")

    }
    else {
        println("the product will be zero")
    }

    println("a * b = ${a * b}")

}
// BETTER VERSION

fun Main (){
    println("ENTER THE NUMBER A :")
    val a = readln().toInt()
    println("ENTER THE NUMBER B :")
    val b = readln().toInt()

    println("A * B = ${a * b}")

    if (a == 0 || b == 0){
        println("THE PRODUCT IS ZERO")
    }
    else if ((a < 0 && b > 0)|| (a > 0 && b < 0)){
        println("THE PRODUCT IS A NEGATIVE  INTEGER")
    }
    else {
        println ("THE PRODUCT IS A POSITIVE  NUMBER")
    }

}
