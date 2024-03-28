// Type conversions

/*

   In Kotlin, the numeric value of one type is not automatically converted to another type even when the other type is larger.
   This situation is different in Java.

*/

fun main() {

    /*

     In Java,

     int number1 = 55;
     long number2 = number1;

      Here, the value number1 of type int is automatically converted to length and assigned to variable number2.

     */


    // val number1: Int = 55
    // val number2: Long = number1   // Error: type mismatch.


    /*

     Even though the size of Long is larger than Int, Kotlin does not automatically convert from Int to Long.

     Instead, you need to use toLong().
     Kotlin does it to avoid surprises and for type safety.

    */

    val number1: Int = 55 // A variable of type int is defined.
    val number2: Long = number1.toLong() // We converted the number1 variable to long type using the toLong() method.
    println(number2) // The converted variable was displayed on the screen.


    /*

    List of functions used for type conversion in Kotlin:

    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

    There is no conversion for bool types.

    There is a transformation from larger type to smaller type.

    There is a loss of value in this transformation.

     */


    val number_1: Int = 545344 // A variable of type int
    val number_2: Byte = number_1.toByte() // The variable of type int is converted to byte type.
    println("number_1 = $number_1") // 545344
    println("number_2 = $number_2") // 64


}