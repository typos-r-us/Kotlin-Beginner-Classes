package introToObjectOrientedProgramming

fun main() {
    val student= StudentDetails()
    println("Name is: ${student.studentName}")
    println("Age is: ${student.studentAge}")
    println("Class is: ${student.studentClass}")
    println("=======================Constructors===========================")
    //
    // classes as constructors (TODO ??what is this called in OOP??) -> Inheritance via constructors.
    //
    val mwana = Mwanafunzi("Kenneth Mwenda", 36, "4th Year") // this is very cool
    print("Name is: ${mwana.name}, ")
    print("Age is: ${mwana.age}, ")
    println("Class is: ${mwana.darasa}")
    println("==============================================================")
    val mwana1 = Mwanafunzi("Thomas Barasa", 20, "2nd Year")
    print("Name is: ${mwana1.name}, ")
    print("Age is: ${mwana1.age}, ")
    println("Class is: ${mwana1.darasa}")
    println("==============================================================")
    val mwana2 = Mwanafunzi("Michael Olunga", 28, "3rd Year")
    print("Name is: ${mwana2.name}, ")
    print("Age is: ${mwana2.age}, ")
    println("Class is: ${mwana2.darasa}")
    println("==============================================================")
    val mwana3 = Mwanafunzi("Arsene Wenger", 65, "Any Year")
    print("Name is: ${mwana3.name}, ")
    print("Age is: ${mwana3.age}, ")
    println("Class is: ${mwana3.darasa}")
    println("==============================================================")
    createStudent()
    println("==============================================================")
    val classStudent = ClassStudent("Kenneth", 9,"Grade 3")

}
fun createStudent(){
    var student = Mwanafunzi("", 1,"")
    println("Please enter student name: ")
    student.name = readLine().toString()
    println("Please enter student age: ")
    student.age = readLine().toString().toInt()
    println("Please enter student class: ")
    student.darasa = readLine().toString()
    println("==============================================================")
    println("The entered information is: ${student.name}, ${student.age}, ${student.darasa}")
    // YAY! this works!!
}
/* Classes with primary constructors (https://beginnersbook.com/2019/03/kotlin-constructors/)
// 1. Primary Constructor
//
// A primary constructor is the easiest way to initialize the class.
// It is declared as part of the class header. In the following example we have declared
// a constructor (val name: String, var age: Int) as part of the class header.
// This is our primary constructor that initializes the studentName, studentClass and studentAge properties
// (data members) of class StudentDetails.;
// See class Mwanafunzi below...*/
class StudentDetails{
    var studentName:String = "Kenneth Mwenda"
    var studentClass:String = "4th Year"
    val studentAge:Int=36
}
class Mwanafunzi(var name:String, var age:Int, var darasa:String)
/* Classes with secondary constructors (https://beginnersbook.com/2019/03/kotlin-constructors/)
// 2. Kotlin Secondary Constructor
// Secondary constructor in Kotlin is created using the constructor keyword.
// They play major role in inheritance. I recommend you to read the inheritance topic first before going
// through the secondary constructor.
// Syntax of secondary constructor is as below;
*/
/*
class ClassName {
    constructor(name: String) {
        // code inside constructor
    }
    constructor(name: String, age: Int) {
        // code inside constructor
    }
}
*/
class ClassStudent{
    constructor(name: String, age: Int, classs: String){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
        println("Student Class: $classs")
    }
}