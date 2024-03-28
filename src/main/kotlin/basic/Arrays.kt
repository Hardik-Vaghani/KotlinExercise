package org.hardik.basic

/*
Array is like Int, String etc. in Kotlin. It is a collection of similar data of a type.
 */

fun main() {

    val myArray = Array<Int>(5) { 0 } // Definition of an array with 5 elements and 0 elements

    myArray[0] = 1 // 0.index updated to 1.

    for (element in myArray) {
        println(element) // The elements of the array are displayed on the screen.
    }

    val my_array: Array<Int> = arrayOf(1, 2, 3, 4, 5) // Defining an array of type int

    println(my_array[0]) // get index 0 of the array.

    println(my_array[2]) // Get the 2nd index of the array.

    println(my_array.size) // SIZE OF ARRAY


    val array_2: Array<String> = arrayOf("Halil", "İbrahim", "Özel") // Defining an array of string type

    println(array_2.isNotEmpty()) // If the array has elements, that is, if the array is not empty

    val any_array: Array<Any> = arrayOf(1, true, 19.00, "halil") // any allows using any type without specifying a specific type.

    println(any_array.isEmpty()) // Is the content of the directory empty? It is checked.


}