// in : operator checks whether there is any element in an array or structure.
// string performs the same function as contains, which is a method.

fun main() {

    val numbers = intArrayOf(1, 4, 42, -3) // A structure containing values of type int

    if (4 in numbers) { // Is there a 4 in numbers?
        println("numbers array contains 4") // We print the message that 4 is found

    }
}