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

    shoppingList.removeAt(1)
    println(shoppingList)

    shoppingList.add(2, "Ram v2")
    println(shoppingList[3])

    shoppingList[3] = "Oil Based Cooling System"
    println(shoppingList)

    shoppingList.set(1, "SATA")
    println(shoppingList)

    val hasRam = shoppingList.contains("SATA")

    if (hasRam){
        println(
            "Has SATA in the list"
        )
    }else {
        println("No SATA in the list")
    }

    for (item in shoppingList){
        println(item)
        if(item == "Ram v2"){
            shoppingList.removeLast()
            println(shoppingList)
            break
        }
    }

}