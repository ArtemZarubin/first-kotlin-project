package com.myproject

fun main() {
    val num: Int = 100
    val longNum: Long = 1000
    val result = num + longNum // 1100, Long
    println("We added Int to Long and got $result")

    val one: Byte = 1
    val two: Byte = 2
    val three = one + two // 3, Int

    val oneNum: Byte = 1
    val five: Byte = 5
    val six = (oneNum + five).toByte() // 6, Byte

    // val longValue: Long = 10.toInt() Error because compiler needs long
}