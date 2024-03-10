package day2

fun main() {

addNumber(10,30)
var x = addNumber(10,20,30)
    println(x+2/2*3)

    var y = subtract(2,20,30)
    println(y)
}
// Function or Methods
// fun functionName(Variable){body}
fun addNumber(x: Int, y: Int){
     var  sum = x+y;
    println("Sum of two numbers is $sum")
}
// METHOD OVERLOADING
fun addNumber(x: Int, y: Int, z: Int):Int{
    var sum = x+y+z;
    return sum
}

fun subtract(x: Int, y: Int, z: Int):Int = x-y-z;