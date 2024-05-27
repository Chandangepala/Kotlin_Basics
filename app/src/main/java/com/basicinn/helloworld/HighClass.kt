package com.basicinn.helloworld

//High Order Class
class HighClass(func: (String) -> Unit) {

    init {
        func("From High Class")
    }
}