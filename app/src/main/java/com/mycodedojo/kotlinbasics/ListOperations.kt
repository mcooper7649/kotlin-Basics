package com.mycodedojo.kotlinbasics

fun main(){
    var fruitsList = mutableListOf(
        "Grapes",
        "Cherries",
        "Watermelons",
        "Oranges",
        "Bananas"
    )

    println(fruitsList)

    fruitsList.add("Tangerines")
    println(fruitsList)

    fruitsList.remove("Grapes")

    println(fruitsList)

    var isOranges = fruitsList.contains("Oranges")

    if (isOranges){
        println("Oranges is on the list")
    } else {
        println("No Oranges on the list")
    }
}