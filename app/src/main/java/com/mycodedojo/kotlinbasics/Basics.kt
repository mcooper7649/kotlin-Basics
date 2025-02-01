package com.mycodedojo.kotlinbasics

fun main(){
    println("Who is this coffee for?")
    val name = readln()
    println("How much sugar would you like?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    makeCoffee(sugarCountInt, name)
}

fun makeCoffee(sugarCount:Int, name:String){

    if(sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}