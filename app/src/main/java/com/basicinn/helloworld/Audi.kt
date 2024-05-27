package com.basicinn.helloworld

class Audi: Car() {
    val chasisNo = 10000

    init {
        //accessing parent class method by using super keyword
        super.pressBrakes()
    }

    fun interior(chasisNo: Int){
        println("Chasis No is: " + this.chasisNo)
    }
}