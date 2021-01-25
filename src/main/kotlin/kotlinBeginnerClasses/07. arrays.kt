package kotlinBeginnerClasses

fun main() {
    // declaring an array using arrayOf() // implicit type declaration
    // This array can contain any datatype; int, string, bool, char, float, double, etc
    val arrayName = arrayOf(1, 2, "String", true, 'k',3.14159, 3.141592653589793)
    for (element in arrayName) // Iterate through the array and ...
    {
        print(" $element") // ... print each element in same line
    }
    println() // Print a blank line
    // declaring an array using arrayOf<Int> //explicit type declaration
    // This array can contain only the explicitly defined datatype (Int in this case)
    val arrayName2 = arrayOf<Int>(10, 20, 30, 40, 50)
    for (element in arrayName2) // Iterate through the array and ...
    {
        print(" $element") // ... print each element in same line
    }
    println() // Print a blank line
    // declaring an array using arrayOf<String>
    // This array can contain only the explicitly defined datatype (String in this case)
    val arrayName3 = arrayOf<String>("10", "Word", "30", "Other Words", "50")
    for (element in arrayName3)  // Iterate through the array and ...
    {
        print(" $element") // ... print each element in same line
    }
    println()
    for (i in 1 until 30){
        print("=")
    }
    println()
    println("The following exercises utilise the third array [\"10\", \"Word\", \"30\", \"Other Words\", \"50\"].")
    // How to access the elements by index?
    println("Accessed and displayed element [3] within the array.")
    print(arrayName3[3])
    println()
    // print border
    for (i in 1 until 30){
        print("=")
    }
    // How to modify the elements in an array by index?
    println()
    arrayName3[3] = "New Text"
    println("Replaced element [3] with 'New Text'.")
    for (element in arrayName3){
        print(" $element")
    }
    println()
    // print border
    for (i in 1 until 30){
        print("=")
    }
    println()
    // 18 Jan 2021
    // Check the size of a array (length)
    println("Check the size of a array (length)")
    println("The size off arrayName3 is: ${arrayName3.size}")
    // print border
    for (i in 1 until 30){
        print("=")
    }
    println()
    // check if an array contains an element. This returns boolean (true or false)
    println("check if an array contains an element. This returns boolean (true or false)")
    println("Does the array contain \"Word\": ${arrayName3.contains("Word")}")
    // print border
    for (i in 1 until 30){
        print("=")
    }
    println()
    println("Check first and last elements arrayname.first(), arrayname.last()")
    // Check first and last elements arrayname.first(), arrayname.last()
    println("First Element: ${arrayName3.first()}, Last Element: ${arrayName3.last()}.")
    // print border
    for (i in 1 until 30){
        print("=")
    }
    println()
    // Index of??
    // Any other information?? Functions/operations on arrays??
}