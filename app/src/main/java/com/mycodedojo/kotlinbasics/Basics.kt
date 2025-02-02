package com.mycodedojo.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main(){
    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
    makeCoffee(coffeeForDenis)
}

fun askCoffeeDetails(){
    println("Who is this coffee for?")
    val name = readln()
    println("How much sugar would you like?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

//    makeCoffee(CoffeeDetails.sugarCountInt, CoffeeDetails.name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails){

    if(coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and ${coffeeDetails.creamAmount} cream")
    } else if(coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar for ${coffeeDetails.name} and ${coffeeDetails.creamAmount} cream")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}and ${coffeeDetails.creamAmount} cream")
    }
}