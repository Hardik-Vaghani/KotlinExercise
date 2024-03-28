/*

&& and(ve) : true - Returns true for the true condition. Returns false for the remaining operations.

|| or(or) : false - returns false for the false condition. Returns true for the remaining operations.

 */


fun main() {


    val a = true

    val b = true

    println(a && b) // true - true : true
    println(!a && b) // false - true : false
    println(a && !b) // true - false : false
    println(!a && !b) // false - false : false

    println("------------------------------")

    println(a || b) // true - true : true
    println(!a || b) // false - true : true
    println(a || !b) // true - false : true
    println(!a || !b) // false - false : false


}