/*
As with variables, a value is assigned to the method with the assignment operator.
When the method is called, age information is written to the screen.
*/

fun myAge() = 21

fun main() {


    //method called.
    println("My Age : ${myAge()}")


    println("Main metodu")
    showMessage() // function call


    sumFun() // call the method

    print("mesaj yazınız : ") // write message notification
    val message: String = readLine()!! //get value from user
    showMessage(message) // send the received value to the method


    print("1. sayıyı giriniz : ") // get the 1st number
    val number1: Double = readLine()!!.toDouble()

    print("2.sayıyı giriniz : ") // get the 2nd number
    val number2: Double = readLine()!!.toDouble()

    val sum: Double = sumComingNumbers(number1, number2) // We sent the entered values to the method.

    println("sayıların toplamı :" + sum) // print the total value.


}


// Methods that do not take parameters


fun showMessage(): Unit {

    println("Merhaba bu ilk fonksiyon")

}


// sumFun() is a parameter-free method that finds the sum of numbers between 1 and 10 and prints it to the screen.

fun sumFun(): Unit {

    var sum = 0 // Variable defined for / total value.

    for (i in 1..10) { // We collected the number values to be collected with the for loop
        sum += i
    }

    println("sayıların toplamı : $sum") // print the total value.

}


// Methods that take parameters

fun showMessage(comingMessage: String): Unit {

    println(comingMessage) // print the sent value on the screen.

}


// x and y values are defined as double type. The method returns a value of type Double.
fun sumComingNumbers(x: Double, y: Double): Double {

    return x + y // The incoming x and y values are collected and sent with return.
}

