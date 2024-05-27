package com.basicinn.helloworld

//abstract calls is getting inherited and abstract members are being overridden
class ClassC: AbstClass() {
    override val secondNo = 50

    override fun product(a: Int, b: Int): Int {
        return a * b
    }
}