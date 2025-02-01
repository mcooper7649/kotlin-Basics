package com.mycodedojo.kotlinbasics

fun main(){

    println("Enter number 1")
    val num1str = readln()
    val num1int = num1str.toInt()
    println("Enter number 2")
    val num2str = readln()
    val num2int = num2str.toInt()

    var myResult = add(num1int, num2int)

    println("The result is $myResult")
}

fun add(num1:Int, num2:Int):Int {
    val result = num1 + num2
    return result
}