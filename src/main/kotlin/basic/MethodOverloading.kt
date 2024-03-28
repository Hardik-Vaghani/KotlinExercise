/*

Overloading: Methods with the same names but different parameter types.
Method names must be the same and parameters must be different.

*/

// returns the incoming number with return.
fun mix(x: Int): Int {

    return x
}

// adds the two incoming numbers and returns the result with return.
fun mix(x: Int, y: Int): Int {

    return x + y
}

// adds the three incoming numbers and returns the result with return.
fun mix(x: Int, y: Int, z: Int): Int {

    return x + y + z
}

fun main() {
    // each method is called one by one.
    println("mix(x):" + mix(10))
    println("10+20 : " + mix(10, 20))
    println("10+20+30 :" + mix(10, 20, 30))
}