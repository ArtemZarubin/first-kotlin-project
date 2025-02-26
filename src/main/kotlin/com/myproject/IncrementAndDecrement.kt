package com.myproject

import java.util.Scanner

fun main() {
    var a = 3
    a += 2 // 5
    a -= 2 // 3
    a *= 2 // 6
    a /= 2 // 3
    a %= 2 // 1

    /*
    * var b: Int
    b += 5 // compile-time error, Variable 'b' must be initialized
    * */

    var num = 3
    num++  // 4, increment
    num--  // 3, decrement

    var numA = 10
    val numB = ++numA
    println(numA)  // a = 11
    println(numB)  // b = 11

    var aa = 10
    val bb = a++
    println(aa)  // a = 11
    println(bb)  // b = 10

    /*
    * 1. Parentheses ( (expr) );
    2. Postfix increment/decrement ( expr++, expr--);
    3. Unary plus/minus, prefix increment/decrement ( -expr, ++expr, --expr );
    4. Multiplication, division, and modulus ( *, /, % );
    5. Addition and subtraction ( +, - );
    6. Assignment operations ( =, +=, -=, *=, /=, %= ).
    * */

    // Task 1
    val scanner = Scanner(System.`in`)
    // Read the input integer
    var n = scanner.nextInt()
    n++
    n--
    n--

    println(n)
}