package com.mycodedojo.kotlinbasics

fun main() {
    var daisy = Dog("Daisy", "Poodle", 1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

    println("A year has passed!")
    daisy.name = "Hello World"
    daisy.age = 2

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

//    var myBook = Book()

//    var customBook = Book("War", "Cooper", 2021)
//
//    println("${myBook.title} by ${myBook.author} was written in ${myBook.yearPublished}")
//    println("${customBook.title} by ${customBook.author} was written in ${customBook.yearPublished}")


}