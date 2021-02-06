package kotlinBeginnerClasses
// Basic introduction to loop constructs
// for, while, do while
// 01: For loop sing a range
fun main() {
    for(i in 1 until 10){ // This one loops 9 times
        print("$i, ")
    }
    println()
    for (i in 1..10){ // and, this one loops 10 times
        print("$i, ")
    }
    println()
    // Run arrayLoop()
    arrayLoop()
    println()
    // Run sqrt
    sqrt()
    println()
    // run whileLoop
    whileLoop()
    println()
    // run checkDiv()
    checkDiv()
}
// 02: For loop sing an array
fun arrayLoop(){
    val myArray = arrayOf("kenya",90,"uganda",100,"rwanda",350,"burundi",8,"tanzania",53,"egypt",7,"ethiopia",92,"angola",0)
    var pos:Int // I really hope this works ...
    for (str in myArray){
        print("$str ")
        pos = myArray.indexOf(str)
        print(":${pos+1}, ")
    }
}
// 03: Function using standard libraries
// Squareroot
fun sqrt(){
    val num = 49
    val root:Double = Math.sqrt(num.toDouble())
    println("the square root of $num is $root.")
}
// 04. While loop - loop runs as long as a condition evaluates to true
// 05. Do while loop
//  Performs the action before evaluating the condition. Even though i is not <10, the "do" code still runs
//  Useful if you want an action to run at least once then evaluate the result before entering the loop,
//  e.g entering user password and looping if password is incorrect. (codinginflow, Kotlin for Beginners - Part 12)
fun whileLoop(){
    var i = 0
    while (i<=10){
        print("$i, ")
        i++
    }
    println()
    do {
        println("This is i: $i")
        i++
    }while (i<10)
}
// CodingInFlow assignment: how many times can you divide a number x by another number y
// before x becomes less than another number z? Use while loop
fun checkDiv(){
    // using 10000 as the number, 8 as the divisor and 10 as the check
    var num = 10000
    var count = 0
    while (num>10){
        num/=8 // compound operator meaning num=num/8, same concept as +=, -=, *=
        count++
    }
    // print the final count
    println("Total rounds: $count")
}
