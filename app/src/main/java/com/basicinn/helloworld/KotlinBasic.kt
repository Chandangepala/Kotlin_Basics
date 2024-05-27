package com.basicinn.helloworld

open class KotlinBasic{
    open val someInt = 11;

   /* init {
        println("We are getting: " + a)
    }*/

    constructor(a: Int = 10, b: Int = 20)  {
        val sum = a + b
        println("This is sum of Two: " + sum)
    }

    constructor(a: Int = 100, b: Int = 200, c: Int = 300){
        val sum = a + b + c
        println("This is sum of Three: " + sum)
    }

    //Kotlin function/method
    open fun Add(a: Int, b: Int): Int{
        return a + b
    }

    //Companion object
    companion object {
        val secondNo = 222;

        fun product(a: Int, b: Int):Int{
            return a * b
        }
    }
}