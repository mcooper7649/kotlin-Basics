package com.mycodedojo.kotlinbasics

fun main(){
    var myResult = add(4, 10)

    println(myResult)
}

fun add(num1:Int, num2:Int):Int {
    val result = num1 + num2
    return result
}