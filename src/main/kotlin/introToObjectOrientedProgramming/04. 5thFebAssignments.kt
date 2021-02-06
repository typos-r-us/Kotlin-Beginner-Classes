package introToObjectOrientedProgramming

fun main() {
    println("=== Printing out the alphabet using for loop and char range ===")
    println()
    alphaDisplay()
    println()
    println()
    println("=== Reversing a sentence using the reverse() method ===")
    reverseSentence("Mandizi ni chakula chetu.")
}
fun alphaDisplay(){
    for (letter in 'A'..'Z')
        print("$letter, ")
}
fun reverseSentence(sentence: String){
    val reversedString = StringBuilder()

    if (sentence!=""){
        val revChar = StringBuilder(sentence).reverse().toString()
        reversedString.append("$revChar")
    }else return

    println("The original text is: $sentence")
    println("The reversed text is: $reversedString")
}