package com.mycodedojo.kotlinbasics

fun main(){
    makeCoffee(1)
    makeCoffee(4)
    makeCoffee(10)
}

fun makeCoffee(sugarCount : Int){
    if(sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar")
    } else {
        println("Coffee with $sugarCount spoons of sugar")
    }
}