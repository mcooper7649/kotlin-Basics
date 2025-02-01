package com.mycodedojo.kotlinbasics

fun main(){

    println("Enter number 1")
    val num1str = readln()
    val num1D = num1str.toDouble()
    println("Enter number 2")
    val num2str = readln()
    val num2D = num2str.toDouble()

    var myResult = divide(num1D, num2D)

    println("The result is $myResult")
}

fun divide(num1:Double, num2:Double):Double{
    val result = num1/num2.toDouble()
    return result
}

fun add(num1:Int, num2:Int):Int {
    val result = num1 + num2
    return result
}