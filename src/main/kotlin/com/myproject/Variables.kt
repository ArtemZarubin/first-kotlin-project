package com.myproject

fun main() {
    // Cannot change val (value)
    val weather = "sunny"
    println("Right now is $weather weather!")

    // Can change var (variable)
    var dayOfWeek = "Monday"
    println(dayOfWeek) // prints Monday

    dayOfWeek = "Tuesday"
    println(dayOfWeek) // prints Tuesday

    val drink = "coffee"
    val favoriteDrink = drink
    println("My favorite drink is $favoriteDrink!")

    val ten = 10
    val greeting = "Hello"
    val firstLetter = 'A'

    println(ten) // prints 10
    println(greeting) // prints Hello
    println(firstLetter) // prints A

    var number = 10
    number = 11 // ok
    // Error here: number = "twelve"

    // Task 1
    val one = 1
    val two = 2
    val three = 3
    val four = 4
    println("$one $two $three $four")

    // Task 2
    val aA = 512343
    val bB = 3431231
    // Do not touch the line below
    println("$aA $bB")

    // Task 3
    val bigNumber = 100_000_000
    // Do not touch the line below
    println(bigNumber)

    // Task 4
    var string = "Hello, World!"
    string = "Hello, Kotlin!"
    println(string)

    // Task 5
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }

    // Write only exchange actions here. Do not touch the lines above
    val c = a
    a = b
    b = c
    // Do not touch the line below
    print("Swapping values: $a $b")

    // Task 6
    var numberNew = 2
    numberNew = 5
    // Do not touch the line below
    print(numberNew)
}