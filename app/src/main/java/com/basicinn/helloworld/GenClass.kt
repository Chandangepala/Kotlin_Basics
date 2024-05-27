package com.basicinn.helloworld

class GenClass<T>(value: T) {

    init {
        println("The value is: $value")
        Check<T>(value)
    }
}

fun <T> Check(text: T){
    println("The received value is: " + text)
}