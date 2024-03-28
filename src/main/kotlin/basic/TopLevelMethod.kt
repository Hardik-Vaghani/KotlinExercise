import TopLevelMethod.Simple
import TopLevelMethod.topLevelMethods


fun main() {

    topLevelMethods() // To access the method, it is imported directly into the project.

    val obj = Simple() // To access the method, it is necessary to create and use an object from the Simple class.
    print(obj.localMethod())

}