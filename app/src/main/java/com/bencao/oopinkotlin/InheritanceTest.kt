package com.bencao.oopinkotlin

fun main(args: Array<String>) {
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320

    car.show()
    println("")
    var motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Yamaha"
    motorcycle.maxSpeed = 190

    motorcycle.show()

}