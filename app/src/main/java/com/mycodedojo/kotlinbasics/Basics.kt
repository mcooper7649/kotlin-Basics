package com.mycodedojo.kotlinbasics

fun main(){
    var age = 0
    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==

    println("please enter your age as a full number")
    //read what the user entered
    val enteredValue = readln()
    //Convert from string to int
    age = enteredValue.toInt()
    if(age in 18..39){
       println("you can go into the bar")
   }else if(age > 40){
       println("you are too old")
   }else{"You are too young to go into the club"}
}