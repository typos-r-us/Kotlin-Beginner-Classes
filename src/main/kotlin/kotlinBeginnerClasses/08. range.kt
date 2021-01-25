package kotlinBeginnerClasses

fun main() {
    // Number range
    print("Numbers between 18 and 27: ")
    for (i in 18 until 27){
        print("$i, ")
    }
    println()
    // Character range
    print("Characters between D and K: ")
    for (c in 'D' until 'K'){
        print("$c, ")
    }
    println()
//    Trying to use an array does not work :-(
//    val array1 = arrayOf('D'..'Z')
//    println("${array1.first()}")
//    println("The range contains \'F\'?: ${'F' in array1}") //
    val range1 = 'D'..'Z'
    println("Characters between \"D\" and \"Z\"")
//    println("$range1")
    for (c in 'D' until 'Z'){
        print("$c, ")
    }
    println()
    println("The range contains \'A\'?: ${'A' in range1}")
    println("The range contains \'J\'?: ${'J' in range1}")
    println("The range does not contain \'C\'?: ${'C' !in range1}")
    //
    //
    //
    // Use downTo() to print reverse alphabet
    for (char in 'Z' downTo 'A'){
        print("$char, ")
    }
    println()
    println("=================================================================")
    val downRange = 'z' downTo 'a'
    for (x in downRange){
        print("$x, ")
    }
    println()
    println("=================================================================")
}