fun main() {

    val name: String? = null // name variable can also be String or null.

    println(name) // Returns null value.

    println(name?.length) // We stated that it can be null while safely displaying it on the screen.

    // It doesn't matter whether println(name!!.length) is null or not. Throws a Null Pointer Exception.


    var bought: Int? // It is of type int but can be null.
    bought = 10
    println(bought) // the number value was displayed on the screen.

    bought = null // Variable of type int was assigned a null value.
    println(bought) // We showed the numerical value on the screen.
    println(bought.toString().length) // Convert number value to string and find its length

}