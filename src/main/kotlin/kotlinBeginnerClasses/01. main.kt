package kotlinBeginnerClasses

// 14th Jan 2021 - Variables and Keywords
// Why no semicolons :-(
// Immutable variables declared using 'val' keyword
// Immutable variables can not ba changed.
// Mutable variables declared using 'var' keyword
// Mutable variables can not be changed.
// Data types...
//
fun main(){
    val fName = "Kenneth";
   // fName = "Omollo"; // fName cannot be changed
    var lName = "Kaunda"; // initializer is redundant because of the reassignment below
    lName = "Omollo"; // lName can be changed
    println("Welcome to Kotlin, $fName $lName");
    println("Alternatively, printed name like this: " + fName +" " + lName);
    println("==============================================================")
    main2()
}
fun main2(){
    //val num:Byte= 200 // this won't run because byte is between -128 and 127
    val num:Byte= 127 // this will run
    println("$num")
}
