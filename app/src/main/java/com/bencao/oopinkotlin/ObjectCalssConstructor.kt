package com.bencao.oopinkotlin

fun main(args: Array<String>) {
    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2010

    println("My cars's name is ${myCar.name} and its model is ${myCar.model}")
    println("My cars's name is ${myCar2.name} and its model is ${myCar2.model}")
}