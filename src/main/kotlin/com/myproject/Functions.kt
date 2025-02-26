package com.myproject

fun main() {
    val numberTen = -10
    val nonNegNumber = Math.abs(numberTen) // it takes -10 and returns 10
    println(" non-negative number: $nonNegNumber")

    val result = println("text")
    println(result) // kotlin.Unit

    // Task 1
    print("Enter number: ")
    val number = readln().toDouble()
    val logNumber = Math.log10(number)
    println(logNumber)
}