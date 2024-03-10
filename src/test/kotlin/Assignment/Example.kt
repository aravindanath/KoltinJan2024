package day1

fun main() {
    var x=("Hello")
    var name="Amruth"
    println("$x $name")


    /* string methods */
    var y="hello World"
    println(y.uppercase())
    println(y.lowercase())
    println(y.capitalize())
    println(y.replace("world", "Amruth"))

    /* operators */

    fun addNo(x:Int,y:Int)
    {
        var sum=x+y
        println("$sum")
    }
    addNo(x=3,y=5)

    fun subtract(x:Int,y:Int)
    {
        var sub=x-y
        println("$sub")
    }
    subtract(x=8,y=6)

    /* conditional statements */


    var day=3
    var msg=when(day)
    {
        1->"mon"
        2->"tue"
        3->"wed"
        4->"thu"
        5->"fri"
        6->"sat"
        7->"sun"
        else->"invalid"
    }
    println("day:$msg")


    var i=0
    while(i<10)
    {
        println("$i")
        i++;
        if(i==6)
            break
    }

}