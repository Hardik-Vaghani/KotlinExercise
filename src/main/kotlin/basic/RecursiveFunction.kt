var i = 5 // global variable definition

/*

   If a method can be executed by itself, these methods are called recursive methods.
   As long as the variable is zero or greater than zero, the method writes a message to the screen.
   he calls himself. The variable i is decremented with each call.

 */

fun rekursif(): Unit {

    i-- // The value of i decreases by one.

    // If the variable i is zero or greater than zero after decreasing by one, print a message to the screen and call itself again.

    if (i >= 0) {
        println("recursive message")
        rekursif()
    } else { // Suppress message if variable i is less than zero.
        print("recursive sonu")
    }


}

fun main() {
    rekursif() // The recursive method must first be called from main().
}