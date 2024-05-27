package com.basicinn.helloworld

//inheritance
class KotlinAdvanced: KotlinBasic() {

    override val someInt: Int = 21

    //overriding parent class method | run time polymorphism
    override fun Add(a: Int, b: Int): Int {
        val sum = a + b
        return sum * sum
    }
}