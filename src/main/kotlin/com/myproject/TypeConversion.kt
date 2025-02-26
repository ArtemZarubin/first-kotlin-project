package com.myproject

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter your number: ")
    val num = scanner.nextDouble()
    val squareRootOfNum = Math.sqrt(num)
    print("Your number is $num, square root is  $squareRootOfNum")

    val numInt: Int = 100

    val res: Double = Math.sqrt(numInt.toDouble())
    println(res) // 10.0

    println(numInt) // 100, it is not modified

    val d: Double = 12.5
    val n: Long = d.toLong() // 12

    print("Enter some data: ")
    val something = readln()

    val da = something.toDouble()
    val f = da.toFloat()
    val i = f.toInt()
    val b = i.toByte()

    println("Your input as a double: $da")
    println("Your input as a float: $f")
    println("Your input as an int: $i")
    println("Your input as a byte: $b")
    println("Your input as boolean: ${something.toBoolean()}")

    // Task 1
    print("Enter first number: ")
    val bigNumebrOne = readln()
    print("Enter second number: ")
    val bigNumebrTwo = readln()
    println("${bigNumebrOne.toLong() + bigNumebrTwo.toLong()}")

    // Task 2
    print("Enter fractional number: ")
    val doubleNumber = readln().toDouble()
    println("${doubleNumber.toLong()}")
}