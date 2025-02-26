package com.myproject

fun main() {
    print("Enter something: ")
    val line = readln()
    println("You entered: $line")

    print("Enter your name: ")
    val name = readln()
    println("Hello, $name nice to meet you!")

    print("Enter pi number: ")
    val piNumber = readln().toDouble()
    println("You answer is $piNumber")

    print("Enter any double type number: ")
    val number = readln().toDouble()
    println("You entered the number: $number")

    print("The earth is flat. Type true or false: ")
    val answer = readln().toBoolean()
    println("The earth is flat: $answer")

    print("Enter a: ")
    val a = readln()
    print("Enter b: ")
    val b = readln().toInt()
    print("Enter c: ")
    val c = readln()
    println("You entered: $a, $b, $c")

    print("Enter 2 words separated by space: ")
    val (firstWord, secondWord) = readln().split(" ")
    println("First word: $firstWord, Second word: $secondWord")

    // Task 1
    print("Enter 2 words separated by space: ")
    val (firstPart, secondPart) = readln().split(" ")
    println("Second word: $secondPart, First word: $firstPart")

    // Task 2

}