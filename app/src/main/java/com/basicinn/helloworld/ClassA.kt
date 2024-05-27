package com.basicinn.helloworld

class ClassA: AddInterface {

    override val firstNo = 101

    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}