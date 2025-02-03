package com.mycodedojo.kotlinbasics

fun main() {
    //Immutable list
    //You cannot add items later on
    //val shoppingList = listOf("Processor", "Ram", "SSD", "Graphics Card")
    //Mutable List you can add items

    val shoppingList = mutableListOf("Processor", "Ram", "SSD", "Graphics Card 3060")

    //adding items to lists
    shoppingList.add("Cooling System")

    shoppingList.remove("Graphics Card 3060")

    shoppingList.add("Graphics Card 4090")

    println(shoppingList)

}