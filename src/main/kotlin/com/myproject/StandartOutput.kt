package com.myproject
// Necessary imports
import java.util.Scanner

fun main() {
    print(108)   // prints a number
    print('c')   // prints a character
    print("Q")   // prints a string
    println('3') // prints a character that represents a digit

    val name = "Artem"
    println("Hello, $name!")
    println("2 + 2 = ${2 + 2}")

    val price = 49
    println("This course costs $price$.")
    // Also like this: println("This course costs $$price.")
    // And like this: println("This course costs \$$price.")

    // task 1
    println("X O X")
    println("X X O")
    println("O O X")

    // Task 2
    println("first")
    println("second")
    println("third")

    // Task 3
    // Create a Scanner object to read the input
    print("Enter number to square it: ")
    val scanner = Scanner(System.`in`)

    // Read an integer using the Scanner object
    val n = scanner.nextInt()

    // Output square of given number
    println("Square of your number is ${n * n}")

    // Task 4
    val age = 20
    val myName = "Artem"
    println("Hello, my name is $myName and I am $age years old!")
}