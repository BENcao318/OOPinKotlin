package com.bencao.oopinkotlin

class MySecondCars {
    var name:String? = null
    var model:Int? = null
        private set
    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }
}