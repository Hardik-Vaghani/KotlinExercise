/*
   Continue: The loop continues to run. However, when a certain condition is met, inside the loop
   The loop goes to the beginning without moving on to the next lines. It executes some values.

*/




fun main() {

    for (i in 1..10) { // return i from 1 to 10

        if (i == 8) { //if the value of i is 8

            continue //pass the value 8
        }

        println(i) // show elements on the screen.
    }


    for (char in "Halil&İbrahim") { // return an expression of string type

        if (char == '&') { //if this character exists

            print(" ") // leave space

            continue //skip that part and continue
        }

        print(char) // print the output to the screen.
    }

}