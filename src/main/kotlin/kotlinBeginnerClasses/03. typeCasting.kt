package kotlinBeginnerClasses

// Typecasting is the conversion of one datatype to another.
// It is done manually unlike in Java
fun main() {
    val num1:Int=23;
//    val num2:Long=num1; // This gives an error due to type mismatch
    val num3:String=num1.toString(); // typecasting...Kotlin style :-)

    println("$num3");
}