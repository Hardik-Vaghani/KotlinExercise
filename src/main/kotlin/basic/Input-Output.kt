fun main() {

    println("1. println "); // ln suffix is used to mean perform the operation and then move to the next line.
    println("2. println ");

    print("1. print "); // If it is the print method, perform the operation and continue without any skipping etc.
    print("2. print");


    val score = 99

    println("score") // score
    println(score) // 99
    println("score : $score") // score : 99
    println("$score") // 99
    println("score : $score") // score : 99

    /*

     There are multiple ways to display the value on the screen:

     1- Direct variable value is given

     2 - You can use it with a string expression, then put a + sign next to it and call it a variable.

     3 - A variable is added next to the $ sign between double quotes. This method is also available in PHP and Javascript languages.

     4- In string expressions, both the variable name and its content can be used with the $ sign.

     */


    // In Kotlin, the readLine() method is used to receive data or value from the user.


    print("What is your name : ") // Prompted to enter name.

    val name = readLine() // Reading the name with the readLine method

    println("My name is $name") // name is printed on the screen


    // If the received value is different from a String expression, it is used as readLine()!!.toX.
    // Type of variable instead of X: Int,Float,Double etc.

    print("How old are you : ") // the question "how old are you" was asked.
    val age = readLine()!!.toInt() // Value of type int was read.
    println("I am $age years old") // the read value was shown on the screen.


}