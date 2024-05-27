package com.basicinn.helloworld

class ClassB: AddInterface {
    override val firstNo = 202

    override fun add(a: Int, b: Int): Int {
        return 2*(a + b)
    }

    override fun add(a: Int, b: Int, c: Int): Int {
        return 2*(a + b + c)
    }
}