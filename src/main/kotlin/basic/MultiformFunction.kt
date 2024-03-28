// Polymorphic Methods: These are structures with the same names but different parameter types.

// showInformation() This method is called a multiform method because the parameter types of the 3 methods are different.

// With this method, the person's name is taken and written to the screen with print.
fun showInformation(name: String): Unit {
    println("Your name : $name")
}

// With this method, the person's age information is obtained and written to the screen with print.
fun showInformation(age: Int): Unit {
    println("Your age : $age")
}


// With this method, the person's date of birth is taken and written to the screen with print.
fun showInformation(birth: Long): Unit {
    println("Your Date of Birth : $birth")
}

fun main() {


    // each method is called one by one with its relevant parameters.
    showInformation("Halil")
    showInformation(21)
    showInformation(birth = 1997)


}