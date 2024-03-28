/*

Variables are symbolic concepts that hold data. Variables can be global and local within the application.
It is divided into two as follows. Global variables can be accessed from anywhere within the application.
Local variables can only be accessed within the code block in which they are defined.

*/


var globalNumber = 12 // Since this variable is global, all given methods can use this variable.

fun fun1(): Unit {

    // Since this variable is local, only the fun1 method can access this variable.
    // Cannot be accessed from other code blocks.
    var localNumber = 21
    println("fun1-global variable : $globalNumber")
}


fun fun2(): Unit {
    println("fun2-global variable : $globalNumber")
    // println("fun2-global variable : $localNumber")
}

fun main(args: Array<String>) {

    println("main-global variable : $globalNumber")
    // println("main-global variable : "+localNumber)
    fun1()
    fun2()
}