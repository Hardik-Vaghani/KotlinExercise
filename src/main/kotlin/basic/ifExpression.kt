// if : means if in English. It is a condition word.
// For example, if I am this age, a message like "I am young" is given.
// If it is at a different age, another conditional statement, else, comes into play.

fun main() {


    val number = 10 // number variable defined.

    val result = if (number > 0) { // if number is greater than 0
        "Positive number" // positive
    } else { // if different from 0
        "Negative number" // Negative
    }

    println(result) // the result value is printed.


    val a = 9  // A positive integer of type int was defined.
    val b = -11 // An integer of negative type was defined.

    val max = if (a > b) { // if a is greater than b
        println("$a is larger than $b.") //a is greater than b.
        println("max variable holds value of a.") // B max variable
        a // 9
    } else { // If in a different situation
        println("$b is larger than $a.") //b is greater than a.
        println("max variable holds value of b.") // A max variable
        b // -11
    }
    println("max = $max") // The max value was shown on the screen.


}