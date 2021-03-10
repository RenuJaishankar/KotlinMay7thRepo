// Welcome to Kotlin!

// Kotlin is a general purpose language that targets the JVM
// this means it can be interoperable with Java code

// functions and variables can be out in floating space, meaning they don't need to belong to another
// data structure

//as such Kotlin is not strictly class-based, and is much more general purpose than Java

// Kotlin data types are as followed

// Numbers: Byte, Short, Int, Long, Float, Double
// Boolean
// Char
// Array
// String

// All data types are declared capitalized

// TODO: list types
//This is a Kotlin program
// like Java however, Kotlin requires an entry point for your code to run
fun myFunction(){
    println("this function  works fine")
}
fun main(){
    //This function call is completely legal because Kotlin does not need things to be wrapped
    myFunction()
    println(a)
    println(b)
    otherFunc()

}
//Kotlin code can have types inferred
var a = "Hello there"
// types can also be explicit
var b:Int=5
//Functions that does not return anything meaningful are said to return Unit
//Unit refers to a datatype that is not meaningful
fun otherFunc():Unit{
    println("This function does not return anything meaningful")
}