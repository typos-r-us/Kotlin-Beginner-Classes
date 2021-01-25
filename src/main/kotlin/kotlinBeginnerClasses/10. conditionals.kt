package kotlinBeginnerClasses

import kotlin.math.abs
import kotlin.math.log10

// Conditional statements
// 1. if
// 2. if else
// 3. if else if
//
fun main() {
    println("=============================================================================")
    println(" Introduction to \"if...else\": Check which number is greater than the other.")
    println("=============================================================================")
    val a = 27
    val b = 15

    var maxValue: Int = if (a>b){
        println("a is greater")
        a
    }else{
        println("b is greater")
        b
    }
    print("The greater value is: ")
    println(maxValue)
    println()
    // When as an expression
    // This is really nice and really cool (",)
    println("=======================================================================================")
    println(" Introduction to \"when\": print a particular string given the result of a given check.")
    println("=======================================================================================")
    val c = 10
    val str:String = when (c){
        100 -> "Centi"
        10 -> "Deci"
        else -> "c is unknown"
    }
    println("===========================================")
    println("Example function to check the length of int")
    println("===========================================")
    println("The number $c has ${c.length()} digits and its roman value is: $str")
    //////////////////////////////////////////////////////////////////////////////
    println()
    checkNeg(-0) // Is it possible to readline() this? ... Yep! see nestedIf() and whenChecker() definitions
    println("=================================================================================================================")
    println("22nd Jan: Create nested if statements to check the status of a number; positive, negative, odd, even, zero, etc.")
    println("=================================================================================================================")
    println(" Please enter number to check: ")
    nestedIf(
        readLine()!!.toInt()
    )
    println("=======================================================")
    println(" Use \"when\" logic to replace the nested if statements")
    println("=======================================================")
    println(" Please enter number to check: ")
    whenChecker(
        readLine()!!.toInt()
    )
}

fun checkNeg(num: Int){
    // if..else..if with nested if..else statements
    if (num<0){
        print("The number is negative")
        if (num>-10){
            println(" and it is a single digit number.")
        }else{
            println(" and it has two or more digits.")
        }
    }else if (num>0){
        print("The number is positive")
        if (num<10){
            println(" and it is a single digit number.")
        }
        else{
            println(" and it has two or more digits.")
        }
    }else{
        println("The number is Zero.")
    }
}
fun nestedIf(num: Int){
    // Positive, Negative, even, odd number check
    if (num==0){
        println("The number is 0")
    }else if (num>0){
        // the number is positive
        if ( num%2==0){ // warning: cascading if statement should be replaced with "when"
            // the number is even
            println("The number is a positive even integer.")
        }else if (num%2 == 1){
            // the number is odd
            println("The number is a positive odd integer.")
        }else{
            println("The number is alien to math.")
        }
    } else if (num<0){
        // The number is negative
        if (num%2==0){ // warning: cascading if statement should be replaced with "when"
            // the number is even
            println("The number is a negative even integer.")
        }else if (num%2==1){
            // the number is odd
            println("The number is a negative odd integer.")
        }else{
            println("The number is alien to math.")
        }
    }else{
        println("The number is alien to math.")
    }
}
// an implementation of the nestedIf() number checker using when statement. Seems much cleaner :-)
fun whenChecker(num: Int){
    // Positive, Negative, even, odd number check
    when {
        num==0 -> {
            println("The number is 0")
        }
        num>0 -> {
            // the number is positive
            when {
                num%2==0 -> {
                    // the number is even
                    println("The number is a positive even integer.")
                }
                num%2 == 1 -> {
                    // the number is odd
                    println("The number is a positive odd integer.")
                }
                else -> {
                    println("The number is alien to math.")
                }
            }
        }
        num<0 -> {
            // The number is negative
            when{
                num%2==0 -> {
                    // the number is even
                    println("The number is a negative even integer.")
                }
                num%2==1 -> {
                    // the number is odd
                    println("The number is a negative odd integer.")
                }
                else  -> println("The number is alien to math.")
            } // End when
        }
        else -> {
            println("The number is alien to math.")
        }
    } // Closing else
}
// Thank you stackoverflow for this little nugget.
// Source: https://stackoverflow.com/questions/42950812/count-number-of-digits-in-kotlin
fun Int.length() = when(this) {
    0 -> 1
    else -> log10(abs(toDouble())).toInt() + 1
}