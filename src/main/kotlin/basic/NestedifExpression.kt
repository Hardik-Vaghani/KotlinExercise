/*

Using nested if provides convenience in many places. For example, comparing 3 numbers
You can easily get the result by using nested if else in the process.

*/

fun main() {

    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max = if (n1 > n2) { // if n1 value is greater than n2 value
        if (n1 > n3) // if n1 value is greater than n3 value
            n1 // n1 is the max value.
        else // or
            n3 // n3 value is maximum.
    } else { // if n2 value is greater than n1 value
        if (n2 > n3) // if n2 value is greater than n3 value
            n2 // n2 value max
        else // if n3 value is greater than n2
            n3 // n3 value is maximum
    }

    println("max = $max") // the result value is displayed on the screen.

}