/*
    For Loop: It is used to repeat operations at regular intervals very easily and requires minimal coding.

    Syntax:

    for (x in collection){
    //codes are written here.}

    - Array, list, range or string expressions can be entered in the specified field in the loop.

 */

fun main() {


    // Print "We Love Kotlin" message on the screen from 1 to 10.

    for (i in 1..10) {

        println("We Love Kotlin")
    }


   // We write my name in the name variable and display its characters one by one on the screen.

    val name = "Halil İbrahim Özel" // name value was given.

    for (ad in name) {

        if (!ad.equals(name.last())) {// if it is not the last element
            print("$ad,") // Write the name value with commas.
        } else { // if there is something other than this condition
            println(ad) // write name characters directly
        }
    }


   // In this example, array is defined. The defined array values are collected and the result is displayed on the screen.

    val numbers = arrayOf(3, 4, 5, 6) //array definition
    var total = 0 // total variable

    for (num in numbers) { // navigate through the contents of the number array

        total += num // adding array elements.
    }

    println("Total : $total") //values collected in the array are displayed on the screen.


    // In our last example, we loop from 1 to 3 in nested for loops and display their sum on the screen.

    for (i in 1..3) { // the value of i is from 1 to 3

        for (j in 1..3) { // j value is from 1 to 3

            println("$i + $j = ${i + j}") // The outer for runs and then enters the inner for and performs the operations.
            // Then the values are printed.
        }
    }

}