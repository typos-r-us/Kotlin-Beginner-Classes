package kotlinBeginnerClasses

fun newKotlinFile(){ // No main function, file will not run :-(
    val boolVal = true;
    println("$boolVal: printed from main function calling other function.")
}
// 19 Jan 2021; here's one way to do it...
fun main() {
    newKotlinFile()
    // Hmm...Can I call other functions in same package?
}