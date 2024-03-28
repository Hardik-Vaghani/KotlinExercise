/*

Do-while: It is similar to the while loop.
The only difference is that the first step is done without looking at the condition, and then the operations within the condition are looked at.

Sytanx :

do {
   // codes inside body of do while loop
} while (testExpression);

*/

fun main() {

    // Example - 1

    var i = 6 // We defined the value of i.
    do {
        println(i) // print the value i to the screen.
        i++ //increase the value of i.
    } while (i <= 5) // If the value of i is less than or equal to 5


    // Example - 2

    var j = 1 // We defined the j value.
    do {
        println(j) // the first action is performed regardless of the condition.
        j++ //increase j value.
    } while (j <= 5) // perform the operations as long as the condition continues.


}