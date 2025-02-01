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
   if(age >= 21){
       println("you can go into the bar")
   }else{
       println("you cannot enter the bar")
   }
}