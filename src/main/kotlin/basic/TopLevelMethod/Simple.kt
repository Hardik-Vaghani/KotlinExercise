package TopLevelMethod

/*

This method is not in any class object or interface.
It is the top-level method. With import, this method can be added directly to another project.
There is no need to define an object for this.

 */

fun topLevelMethods(){
    println("This is a message of the top-level method.")
}

/*

Since this method is local and defined within a class, it can be directly imported via import.
It is not added to another project. To access this method, it is necessary to create an object of the Simple class.

 */

class Simple {

    fun localMethod(){
        println("This is a message of the local method.")
    }
}