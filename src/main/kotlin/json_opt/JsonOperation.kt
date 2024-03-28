package org.hardik.json_opt

import com.google.gson.Gson
import java.io.FileReader
import java.io.FileWriter

fun main() {

    val user = User(
        "Hardik",
        193,
        "MDQ6VXNlcjQ1q",
        "https://avatars.githubusercontent.com/u/45?v=4",
        "",
        "https://api.github.com/users/mojodna",
        "https://github.com/mojodna",
        "https://api.github.com/users/mojodna/followers",
        "https://api.github.com/users/mojodna/following{/other_user}",
        "https://api.github.com/users/mojodna/gists{/gist_id}",
        "https://api.github.com/users/mojodna/starred{/owner}{/repo}",
        "https://api.github.com/users/mojodna/subscriptions",
        "https://api.github.com/users/mojodna/orgs",
        "https://api.github.com/users/mojodna/repos",
        "https://api.github.com/users/mojodna/events{/privacy}",
        "https://api.github.com/users/mojodna/received_events",
        "User",
        false
    )

    /** WORK with Json library */

    val gson = Gson()
    //convert to json
    val myJson = gson.toJson(user)
    println("work done for creating Json to String!")
    println(myJson)


    /** Write to file (create & write in to the file)*/
    try {
        val writer = FileWriter("user.json")
        gson.toJson(user, writer)
        writer.close()
        println("work done for writing")
    } catch (e: Exception) {
        throw RuntimeException(e)
    }

    /** Read from file (open & read & get data from the file)*/
    try {
        val reader = FileReader("user.json")
        val user1 = gson.fromJson(reader, User::class.java)
        println("work done for reading \n$user1")
    } catch (e: Exception) {
        throw RuntimeException(e)
    }
}


