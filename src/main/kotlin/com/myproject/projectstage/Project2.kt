package com.myproject.projectstage

fun main() {
    // Inventory and store prices
    val bubblegum = 2
    val toffee = 0.2
    val iceCream = 5
    val milkChocolate = 4
    val doughnut = 2.5
    val pancake = 3.2
    // Showing prices
    println("Prices:")
    println("Bubblegum: $$bubblegum")
    println("Toffee: $$toffee")
    println("Ice cream: $$iceCream")
    println("Milk chocolate: $$milkChocolate")
    println("Doughnut: $$doughnut")
    println("Pancake: $$pancake")
    println()

    // Income by every position
    val bubbleGumIncome = 202
    val toffeeIncome = 118
    val iceCreamIncome = 2250
    val milkChocolateIncome = 1680
    val doughnutIncome = 1075
    val pancakeIncome = 80
    val income = bubbleGumIncome + toffeeIncome + iceCreamIncome + milkChocolateIncome + doughnutIncome + pancakeIncome
    // Showing income
    println("Earned amount:")
    println("Bubblegum: $$bubbleGumIncome")
    println("Toffee: $$toffeeIncome")
    println("Ice cream: $$iceCreamIncome")
    println("Milk chocolate: $$milkChocolateIncome")
    println("Doughnut: $$doughnutIncome")
    println("Pancake: $$pancakeIncome")
    println()
    println("Income: $$income")
}