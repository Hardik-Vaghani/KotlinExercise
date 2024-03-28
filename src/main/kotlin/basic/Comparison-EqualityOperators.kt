/*

> : is less than
< : greater than
>= : greater than or equal to
<= : less than equal
== : equals
!= : is not equal.

 */


fun main() {
    val a = -12

    val b = 12

    // if control structure will be explained in later lessons.
    val max = if (a > b) { // if a is greater than b
        println("a is larger than b.") // a is greater than b.
        a // prints the value a to the screen.
    } else { // for other cases
        println("b is larger than a.") // b is greater than a.
        b // prints the value b to the screen.
    }

    println("max = $max") // max value is printed on the screen.
}