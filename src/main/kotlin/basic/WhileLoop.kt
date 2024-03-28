/*

While loop is used to iterate a part of the program several times.
The loop executes the block of code until the condition is true.

Syntax

while (testExpression) {
    // codes inside the while loop
}

 */


fun main() {


    var i = 1 // The value i was given.

    while (i <= 5) { // until i is less than or equal to 5
        println("$i") // Print the value i.
        ++i // önden arttırım
    }


    // Program to find the sum of numbers from 0 to 10

    var sum = 0 // collection variable defined.
    var j = 10 //j value given.

    while (j != 0) { // If j value is different from 0
        sum += j     // sum = sum + j; // Add value j with sum
        --j // Decrease j and continue the loop
    }
    println("sum = $sum") // print the total value.

}