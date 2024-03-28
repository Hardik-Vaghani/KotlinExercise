/*

There are two types of variables in Kotlin.
These are: yes and val

var: comes from the word variable. It is used for changing values.

val: comes from the word value. It is used for unchanging or fixed values.

The use of the val variable corresponds to the word final in Java.

 */


fun main() {

    val name: String // A variable named name is defined.

    name = "Halil" // A String type content was assigned to the defined variable.

    println("My name is :$name") // Displays the content of the name variable on the screen.

    val pi: Double = 3.14 // A Double type variable named pi was defined and its value was assigned.

    println("pi :$pi") // Prints pi value to the screen

    /*

    Kotlin has removed the requirement that you must specify the variable type, like Java.
     Whether the user specifies its type or not, which variable is used when the code is processed.
     It belongs to its species and understands it itself.

     In Java: String name = "Name"

     In Kotlin: var name = "Name"

     Once a variable is defined, steps can be followed as follows:

     1 - var name = "Name" // In step 1, the structure to be used is assigned directly without specifying the variable type.

     2 - var name : String // In the 2nd step, you can first specify the variable type and then assign the content.
         name = "Name"

     3 - var name : String = "Name" // In step 3, both the variable type and its content are given in a single line.

     */

}