package com.myproject

fun main() {
    val text: String = "Hello, I am studying Kotlin now."
    val myName = "Artem"    // Compiler knows it's a String
    val myAge: Int = 20

    println(text)
    println("My name is $myName and I'm $myAge years old!")

    val greetings: String
    greetings = "Hello World!"

    /*val greetings
    greetings = "Hello World!"
    Error, because no value assigned to variable while creating it.*/

    // val n: Int = "abc" // Type mismatch: inferred type is String but Int was expected

    // Task 1
    val first = "Artem"
    val last = "Zarubin"
    val age = 20

    // put your code above
    println("My name is $first $last and I’m $age years old")
}