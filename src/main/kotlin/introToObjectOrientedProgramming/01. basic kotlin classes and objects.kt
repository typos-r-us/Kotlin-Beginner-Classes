package introToObjectOrientedProgramming
//declare the class name
// Classes are definitions of datatypes. The actual datatypes that we create from the classes are called objects.
//
class School{
    // add the data members
    private var num:Int = 2002
    private var name:String = "Kenneth"

    // add a function member
    fun square(i: Int): Int {
        return i * i
    }
    // we can also use the data member in the function member, num in this case
    fun isOdd():Int{
        return if (num%2==0){ // return lifted out of if statement
            0
        }else{
            1
        }
    }
    // add constructor????? why not???
    //
}

fun main() {
    // create an object of the class
    val objSchool = School()
    // Access the functions in the class by referencing the object
    println("=========IsOdd()=========")
    println("${objSchool.isOdd()}")
    println("==========================")
    println("==========Square==========")
    println("${objSchool.square(30)}")
}
