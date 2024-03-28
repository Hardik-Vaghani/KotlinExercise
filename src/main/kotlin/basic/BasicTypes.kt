/*
    Kotlin is a statically typed language like Java.
    That is, the type of a variable is known at compile time.
*/


/*
   Built-in types in Kotlin can be categorized as follows:

    numbers
    characters
    booleans
    Arrays
*/


/*
    Number Type

    Numbers in Kotlin are similar to Java.
    There are 6 built-in types representing numbers:

    -Bytes
    -Short
    -int
    -Long
    - Float
    -Double
*/

fun main() {

/*

   byte

    The byte data type can have values from -128 to 127 (8-bit signed binary integer).
    When you are sure that the value of a variable will be within [-128, 127],
    Used instead of Int or other integer data types to save memory.

*/


    val range: Byte = 111 // A variable of type byte is defined.
    println("range : $range") // Since the variable value is between -128 and 127, it writes the range value to the screen

   // val rangeTwo : Byte = 133 Either convert it to byte with toByte or convert it to int type

    /*

    Short

    Short data type can have values between -32768 and 32767
    (two complementary integers with a 16-bit signature).
    When you are sure that the value of the variable will be within [-32768, 32767],
    Used instead of other integer data types to save memory.

     */


    val temp: Short = 12345 // Since the temp value is within the range of the Short type, there will be no problem.
    println("temp : $temp") // printing the content to the screen.


    /*

    Int

    Int data type can have values between -2^31 and 2^31-1 ^
    (32-bit signed two complement integers).

     */


    val result: Int = 1000000 // A variable of type int is defined.
    println(result) // print the result to the screen.


    /*

    If you assign an integer between -2^31 and 2^31-1 to a variable without explicitly specifying its type,
    The variable will be of type Int.^


     */

    val number = 1903 // If type is not specified, it is processed as int type.


    /*

    Long

    Long data type can have values from -2^63 to 2^63-1^
    (64-bit signed two complement integers).

     */

    val score: Long = 9999 // A variable of type long is defined.
    println(score) // score value was displayed on the screen.

    /*
    Convert a variable to a variable greater than 2^31-1 or less than -2^31
    If you assign it (without explicitly specifying its type), the variable will be of type Long.
     */


    // The distance variable is of type long, you can find out the type of the variable by pressing ctrl+shift+p.
    val distance = 10000000000


    // Similarly, you can use a capital letter L to indicate that the variable is of type Long.

    val newValue = 100L // It is a long type variable.


    // Double : is a double precision 64-bit floating point number.

    val examNote: Double = 99.9 // It is used in dotted numbers.
    println("examNote : $examNote") // Where did you deduct 0.01 points from, Zalım teacher :)


    // Float: The data type is a single precision 32-bit floating point.

    val coldValue: Float = -10F // Used with the f parameter.
    println(coldValue) // the content of the variable is displayed on the screen.

    /*
    In the above program we used 19.5F instead of 19.5.
    This is because 19.5 is a Double variable and you cannot assign a Double value to a variable of Float.
    In order for the compiler to treat 19.5 as Float, you need to use F at the end of the variable.
     */


    var myNumber: Number = 1903  // int type

    println(myNumber) // 1903

    myNumber = 19.03 // double type

    println(myNumber) // 19.03

    myNumber = 1903F // float type

    println(myNumber) // 1903.0

    myNumber = 1903L // long type

    println(myNumber) // 1903


    // Char: Char types are used to represent a character in Kotlin.

    val character: Char = 'A' // A variable of type char is defined.

    println(character) // character value displayed on the screen.


    // In Java, the value in the ascii table can be given and the equivalent value can be obtained accordingly.

    // char letter = 65;

    // But Kotlin does not allow such an operation and declares it to be incorrect.


    // Boolean: Data type has two possible values, true or false.

    val state: Boolean = true // We can assign true or false results.
    println(state) // status result
}