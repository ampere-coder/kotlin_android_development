fun main(){
    val number = 23
//    val kt :Int = 2147483649    not possible because the value fo the variable larger than max value

    val integerMaxvalue = Int.MAX_VALUE
    val integerMinvalue = Int.MIN_VALUE

    println ("MAXIMUM VALUE OF THE INTEGER : $integerMaxvalue")
    println ("MINIMUM VALUE OF THE INTEGER : $integerMinvalue")

    val byteMaxvalue :Byte = Byte.MAX_VALUE
    val byteMinvalue :Byte = Byte.MIN_VALUE
    println("MAXIMUM VALUE OF THE BYTE : $byteMaxvalue")
    println("MINIMUM VALUE OF THE BYTE : $byteMinvalue")

    val shortMaxvalue : Short = Short.MAX_VALUE
    val shortMinvalue : Short = Short.MIN_VALUE
    println("THE MAXIMUM VALUE OF THE SHORT IS $shortMaxvalue")
    println("THE MINIMUM VALUE OF THE SHORT IS $shortMinvalue")


    val longMaxvalue : Long = Long.MAX_VALUE
    val longMinvalue : Long = Long.MIN_VALUE
    println("THE MAXIMUM VALUE OF THE LONG IS $longMaxvalue")
    println("THE MINIMUM VALUE OF THE LONG IS $longMinvalue")
}