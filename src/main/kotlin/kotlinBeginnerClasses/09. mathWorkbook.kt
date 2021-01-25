package kotlinBeginnerClasses

fun main() {
    // NB, both the numbers are Int, so the result of the math operations will be treated as an int.
    // There will be no decimal places in the quotient (no type coercion??)
    // The variables quotient and remainder only store the Int part of the math results
    val numerator = 31
    val denominator = 7
    // Use division operator to find the quotient
    val quotient = numerator / denominator
    // Use modulus operator to find the remainder
    val remainder = numerator % denominator

    println("The quotient is: $quotient")
    println("The remainder is: $remainder")
    println("===============================================================")
    println("Please enter the first number:")
    var number1 = readLine()?.toInt()
    println("Please enter the second number:")
    var number2 = readLine()?.toInt()
    // Readline reads input as string, so it's important to convert to Int for mathematical addition
    // The "?" before the "." checks that the input is not null

    var number3 = number1?.plus(number2!!)
    // The addition function used is "plus()". The IDE replaced my "+" and didn't even say please.
    // The "!!" is apparently a "not null assertion" which I need to read more on.
    println("The result of the addition is: $number3")
    println("===============================================================")

    // I have chosen to include suggestions from my IDE in the comments alongside the original code that I'd written
    // to preserve my train of thought and possibly make for easy understanding of why it derails.

    // Lets try subtraction. This works and the result is equal to number 2
    // Operator call corresponds to a dot-qualified call
    // 'number3.minus(number1)' which is not allowed on a nullable receiver 'number3'.
//    number3 = number3 - number1
    // Surround with null check
    if (number3 != null) {
//        number3 -= number1
            // Type mismatch.
            // Required:   Int
            // Found:   Int?
        // Surround with null check
            // look ma...a nested if statement!!!
        if (number1 != null) {
            number3 -= number1 // subtract number1 from number3 which is the sum of number1 and number2
        }
    }

    //number3+=2
    //number3 = number3?.plus(2)

    println("The value of the second number is: $number3")
    println("===============================================================")
}