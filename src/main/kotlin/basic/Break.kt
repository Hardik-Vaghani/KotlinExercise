/*

  Break: It is a command that allows exiting the loop.

*/



fun main() {

    for (i in 1..10) { // return from 1 to 10

        if (i == 8) // if the value of i is equal to 8
            break // break and exit the loop

        println(i) // Display i values on the screen.
    }


    for (char in "Halil&Özel") { // String is an expression

        if (char == '&') // when you see this character
            break // break and exit the loop
        print(char) // show the value before break on the screen
    }
}