package org.hardik.basic

/*

Arithmetic Operators

+ : Addition

- : Subtraction

* : Impact

/ : Divide

% : Getting Mode

 */

fun main() {

    val number1 = 28.0  // The value number1 was given.

    val number2 = 7.0 // The value number2 was given.

    var result: Double = number1 + number2 // result value defined. // addition operation was performed.

    println("$number1 + $number2 = $result")
    // If you have used languages such as javascript or php, you are likely to encounter this type of printing.
    // It will be explained in detail in the following lessons.


    result = number1 - number2 // extraction was done.

    println("$number1 - $number2 = $result") // The result of the extraction process was shown on the screen.


    result = number1 * number2 // multiplication was done.

    println("$number1 * $number2 = $result") // The multiplication process was shown on the screen.


    result = number1 / number2 // division was done.

    println("$number1 / $number2 = $result") // The division process was shown on the screen.


    result = number1 % number2 // mod importing process has been done.

    println("$number1 % $number2 = $result") // The mode result was shown on the screen.


    // + operator is also used to concatenate String values.

    val start = "Talk is cheap. " // head sentence
    val middle = "Show me the code. " // middle sentence
    val end = "- Linus Torvalds" // the author of the words

    val sentence = start + middle + end // We combined them in the sentence variable.
    println(sentence) // The combined string expressions were displayed on the screen.
}