/*

The when structure is similar to the switch-case structure used in Java.
You will be able to make easier conditions with When, which has a more flexible structure.

 */

fun main() {


    val a = 12
    val b = 5

    print("Enter operator either +, -, * or / : ") // The option related to the desired operation is selected.

    val operator = readLine() // The selected operator is read.

    val result = when (operator) {
        "+" -> a + b // + if : addition operation
        "-" -> a - b // - if : subtraction
        "*" -> a * b // * if : multiplication
        "/" -> a / b // / if : division operation
        else -> "$operator operator is invalid operator." // if another character is entered
    }

    println("result = $result") // the result is displayed on the screen.


    // Checking whether an expression with more than one value is included in its content.

    val n = -1 // variable defined.

    when (n) { // n value
        1, 2, 3 -> println("n is a positive integer less than 4.") // If it is one of 1,2,3
        0 -> println("n is zero") // n 0 dır.
        -1, -2 -> println("n is a negative integer greater than 3.") // -1,-2 is negative
    }

    // It can also be used by specifying range.

    val j = 100 // variable j is assigned the value 100.

    when (j) { // j değeri
        in 1..10 -> println("A positive number less than 11.") // If it is between 1 and 10
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)") // if it is between 10 and 100
    }
}