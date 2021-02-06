package introToObjectOrientedProgramming
// https://beginnersbook.com/2019/03/kotlin-inheritance/

fun main() {
    val d = Dog("Black",4)
    d.woof()
    val c = Cat("White", 1)
    c.meow()
    val h = Horse("Brown", 8)
    h.neigh()
    /// Check function overriding
    val m = Man()
    m.sleep()
    /// Check data member overriding
    val f=Fundis()
    print("${f.truthfulness}! ")
    f.character()
    /// Calling functions and data members of parent class from child class using "super" keyword
    val obj = Child()
    obj.demo() // Calls demo function of child class, uses super keyword to call num property of parent class
    obj.demo2() // uses super keyword to call demo function of parent class
}
// Note: By default all classes in Kotlin are final so you have to use the open annotation in the parent class,
// this tells the compiler that this class can be inherited by other classes.
open class Animal(colour: String, age: Int) {
    init {
        println("Color is: $colour.")
        println("Age is: $age")
    }
}
//
class Dog(colour: String, age: Int): Animal(colour, age) {
    fun woof() {
        println("Dog makes sound of woof")
    }
}
//
class Cat(colour: String, age: Int): Animal(colour, age) {
    fun meow() {
        println("Cat makes sound of meow")
    }
}
//
class Horse(colour: String, age: Int): Animal(colour, age) {
    fun neigh() {
        println("Horse makes sound of neigh")
    }
}
/*
* Overriding member functions and properties in Kotlin
* If a function or property with the same name exist in the child class then we need to override the them
* in child class using override keyword.
*
* Overriding member function
* A child class can override the member function of parent class using override keyword.
* By overriding a function, a child class gives its own implementation to the already existing code of base class.
* Overriding doesn’t mean that it will update the code in base class, the change is only applicable to
* the class overriding the function or its sub classes. .
*/
open class Human {
    open fun sleep() {
        println("Humans sleep for approximately 8 hours a day.")
    }
}

class Man: Human() {
    override fun sleep() {
        println("Men only sleep when they have to.")
    }
}
/*Overriding properties (data members) of base class
* We can override the property of base class, similar to what we have seen above for member function.
* In the following example we have a property colour in the parent class and we are overriding it in the
* child class.
* */
open class Kenyan {
    open var truthfulness: String = "Truthful"
}

class Fundis: Kenyan() {
    override var truthfulness: String = "Liars"
    fun character() {
        println("Fundis lie to clients.")
    }
}
/*
* Calling data members and member functions of base class from child class
* In the following example we are calling the data member num and member function demo() of Parent class
* from the Child class using super keyword.
*/
open class Parent() {
    open var num: Int = 100
    open fun demo(){
        println("demo function of parent class")
    }
}

class Child: Parent() {
    override var num: Int  = 101
    override fun demo() {
        super.demo()
        println("demo function of child class")
    }
    fun demo2(){
        println(super.num)
    }
}