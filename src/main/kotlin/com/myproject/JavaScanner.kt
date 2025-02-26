package com.myproject

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter any text: ")
    val line = scanner.nextLine() // read a whole line, e.g., "Hello, Kotlin"
    print("Enter any number: ")
    val num = scanner.nextInt()   // read a number, e.g., 123
    print("Enter any word: ")
    val string = scanner.next()   // read a string, e.g., "Hello"

    println("Some text: $line, some number: $num, some word: $string!")



    // Task 1
    val readText1 = scanner.next()
    val readText2 = scanner.next()
    val readText3 = scanner.next()
    val readText4 = scanner.next()
    val readText5 = scanner.next()
    print("$readText1\n$readText2\n$readText3\n$readText4\n$readText5")
}