/*
   Range: It means range in Turkish.
   To give an example, we have a value and is this value within the range we specified or not?
   It is a structure developed to help us find the answer easily.
 */

fun main() {

    var numberForward = 1..20 // forward from 1 to 20
    var letterForward = 'a'..'z'  // forward from a to Z

    var numbersbackwards = 20..1 // backwards from 20 to 1
    var lettersbackwards = 'z'..'a' // backwards from z to a


    var oneToTwenty = 1.rangeTo(20) // 1 child 20 frame

    var oneToTwentyReverse = 20.downTo(1) // Used if the range is from largest to smallest backwards from 20.


    var fiveByFiveNumbers = 0.rangeTo(100).step(5) // 5 is 5 is 100th frame


    var fiveByFiveNumbersReverse = 100.rangeTo(5).step(5) // 5 is 5 is 100th frame

    println(fiveByFiveNumbers.first) // first element
    println(fiveByFiveNumbers.last) // last element
    println(fiveByFiveNumbers.step) // Transactions are being made indiscriminately.

    for (i in 1 until 5) { // until: It is used to mean from 1 to 5. It can be used instead of (..).

        println(i) // i values were shown on the screen.
    }


}