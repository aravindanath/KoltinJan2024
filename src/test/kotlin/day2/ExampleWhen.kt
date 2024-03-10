package day2

fun main() {

   var day = weekday(7)

    println(day)


}


fun weekday(day : Int):String{
    var msg = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
  return msg
}