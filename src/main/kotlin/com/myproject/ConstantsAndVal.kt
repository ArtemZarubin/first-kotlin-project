package com.myproject

import java.util.*

const val MY_STRING = "This is a constant string"
const val CONST_INT = 127
const val CONST_DOUBLE = 3.14
const val CONST_CHAR = 'c'
const val CONST_STRING = "I am constant"
// const val CONST_ARRAY = arrayOf(1, 2, 3) // error: only primitives and strings are allowed

fun main() {
    val pi = 3.1415
    val helloMsg = "Hello"

    println(pi)       // 3.1415
    println(helloMsg) // Hello

    // list creation
    var myMutableList = mutableListOf(1, 2, 3, 4, 5)
    // trying to update the list
    myMutableList = mutableListOf(1, 2, 3, 4, 5, 6)

    // list creation
    val myMutableListTrick = mutableListOf(1, 2, 3, 4, 5)
    // adding a new element
    myMutableListTrick.add(6)   // it works
    // printing the list
    println(myMutableListTrick) // [1, 2, 3, 4, 5, 6]

    // Task 1
    print("enter number: ")
    val x = readLine()!!.toInt()

    val twice = x * 2
    println("Your number doubled: $twice")

    // Task 2
    val scanner = Scanner(System.`in`)

    // Get user input
    print("Insert number: ")
    val userInput = scanner.nextInt()

    val cubeNumber = userInput * userInput * userInput
    println("Your number in cube: $cubeNumber")
}