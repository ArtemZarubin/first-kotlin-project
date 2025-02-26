package com.myproject

fun main() {
    // Numbers
    val byteNum: Byte = 4
    val shortNum: Short = 23
    val zero = 0 // Int
    val one = 1  // Int
    val oneMillion = 1_000_000  // Int

    val twoMillion = 2_000_000L           // Long because it is tagged with L
    val bigNumber = 1_000_000_000_000_000 // Long, Kotlin automatically chooses it (Int is too small)
    val ten: Long = 10                    // Long because the type is specified

    val shortNumber: Short = 15 // Short because the type is specified
    val byteNumber: Byte = 15   // Byte because the type is specified
    println("Int min: ${Int.MIN_VALUE}")  // -2147483648
    println("Int max: ${Int.MAX_VALUE}")  // 2147483647
    println("Int size: ${Int.SIZE_BITS}")  // 32
    println("Long min: ${Long.MIN_VALUE}") // -9223372036854775808
    println("Long max: ${Long.MAX_VALUE}") // 9223372036854775807
    println("Long size: ${Long.SIZE_BITS}")  // 64

    val pi = 3.1415              // Double
    val e = 2.71828f             // Float because it is tagged with f
    val fraction: Float = 1.51f  // Float because the type is specified
    println("Double max: ${Double.MAX_VALUE}")
    println("Float max: ${Float.MAX_VALUE}")

    val lowerCaseLetter = 'a'
    val upperCaseLetter = 'Q'
    val number = '1'
    val space = ' '
    val dollar = '$'

    val enabled = true
    val bugFound = false

    val creditCardNumber = "1234 5678 9012 3456"
    val message = "Learn Kotlin instead of Java."
}