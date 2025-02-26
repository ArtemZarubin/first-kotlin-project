package com.myproject

import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val two = 2  // Int
    val ten = 10 // Int

    val twelve = two + ten // 12
    val eight = ten - two  // 8
    val twenty = two * ten // 20
    val five = ten / two   // 5
    val zero = ten % two   // 0, no remainder

    val longNumber1 = 1_000_000_000_000_000
    val longNumber2: Long = 1_000_000
    val longNumber3 = 1000L

    val result = longNumber1 + longNumber2 - longNumber3
    println(result) // 1000000000999000

    val uByte: UByte = 5u
    val uShort: UShort = 10U

    val smallSize = 100u // UInt by default
    val bigSize = 5_000_000_000u // ULong because the number doesn't fit in UInt

    val smallLong = 10uL // ULong because it is marked with "uL"

    // MAX_VALUE: Int = 2147483647
    var d: Int = 2147483647
    d += 1
    println(d) // -2147483648

    // Task 1
    val numberOfSquirrels: Short = readln().toShort()
    val numberOfNuts: Short = readln().toShort()
    println(numberOfNuts / numberOfSquirrels)

    // Task 2
    print("Number of students in first class: ")
    val firstClass = readln().toInt()
    print("Number of students in second class: ")
    val secondClass = readln().toInt()
    print("Number of students in third class: ")
    val thirdClass = readln().toInt()

    // Для каждого класса считаем количество парт
    val tablesForFirstClass = (firstClass + 1) / 2
    val tablesForSecondClass = (secondClass + 1) / 2
    val tablesForThirdClass = (thirdClass + 1) / 2

    // Суммируем все столы
    val totalTables = tablesForFirstClass + tablesForSecondClass + tablesForThirdClass

    println(totalTables)

    // Task 3
    print("Enter any number to get last digit: ")
    val lastDigit = readln().toInt()
    val last = lastDigit%10
    println("Last digit of number $lastDigit is $last")

    // Task 4
    val scanner = Scanner(System.`in`)
    print("Enter any number: ")
    val number = scanner.nextInt()

    val incrementedNum = number + 2
    val squareRoot = sqrt(number.toDouble())
    println(incrementedNum)
    println(squareRoot)
}