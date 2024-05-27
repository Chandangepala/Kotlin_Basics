package com.basicinn.helloworld

abstract class AbstClass {
    val firstNo = 25
    abstract val secondNo: Int

    fun add(a: Int, b: Int): Int{
        return a + b
    }

    abstract fun product(a: Int, b: Int): Int
}