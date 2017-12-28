fun main(args: Array<String>) {
    var a = 2
    var b = 2

    if (a == b) {
        println("a does in fact is equal to b")
    }

    b = 3
    if (a != b) {
        println("a does not equal b")

    }

    val accountBalance = 100
    val price = 50
    if (accountBalance >= price){
        println("You can by this")
    }else{
        println("Sorry you broke!")
    }

//    Handle multiple conditionals
    val degrees = 50
    if (degrees >= 70){
        println ("This is some kind of nice weather")
    }else if(degrees < 70 && degrees >=50){
        println ("You need to bring some sweater")
    }else{//below 50
        println ("Too cold!!!")
    }

    //conditional logic based on boolean value
    val isHungry = false
    val isBored = true

    if (isHungry || isBored){ //note: isHungry is implicit isHungry==true and isBored is isBored==true implicitly
        println("Lets get Pizza!")
    }

    //conditional logic using when/or switch = replacement of long elseif

    val x = 3
    when (x) {
        //what can x be
        1 -> println ("x=1")
        2 -> println ("x=2")
        else -> println("x does not equal to 1 or 2")
    }

    //extend the Vader function to have conditionals
    fun vaderIsFeeling(mood:String="angry"){
        if(mood=="angry"){
            println("run for the hills, Vader is $mood")
        }else{
            println("whatever you do do not make Vader angry")
        }
    }
    vaderIsFeeling()
    vaderIsFeeling("happy")

}