package day2

fun main() {

    var marks = 80;

    if(marks<35){
        println("Fail")
    }else if(marks>=35 && marks<50){
        println("Pass class")
    }else if(marks>=50 && marks<65){
        println("Second class")
    }else if(marks>=65 && marks<85){
        println("Fisrt class")
    }else if(marks>=85 && marks>=100){
        println("Top class")
    }else{
        println("Contact admin")
    }

}