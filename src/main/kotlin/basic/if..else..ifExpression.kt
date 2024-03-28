fun main() {


    // Finding Positive - Negative Number

    val number = 58 // number variable definition

    val result = if (number > 0) // if number is greater than 0
        "positive number"  // positive
    else if (number < 0) // if number is less than 0
        "negative number" // negative
    else // or if it is equal to another value, i.e. 0
        "zero" // none

    println("number is $result") // what the result is shown on the screen.


    // University letter grade calculation example


    print("Your visa note :") // visa note is requested.

    val visa = readLine()!!.toDouble()// visa grade is received in double type.

    print("Your final grade :") // final grade requested.

    val final = readLine()!!.toDouble() // final grade is taken as double type.

    val average = (visa * 0.4) + (final * 0.6) // average calculation is made.

    val conclusion = if (average >= 70) //if the average is equal to or above 70
        "AA"
    else if (average < 70 || average >= 60) // if the average is less than 70 or greater than or equal to 60
        "BB"
    else if (average < 60 || average >= 50) // if the average is less than 60 or greater than or equal to 50
        "CC"
    else if (average < 50 || average >= 40) // if the average is less than 50 or greater than or equal to 40
        "DD"
    else // if it is a different value
        "FF"

    println("Average : " + average) // average value
    println("Conclusion : $conclusion") // result value

}