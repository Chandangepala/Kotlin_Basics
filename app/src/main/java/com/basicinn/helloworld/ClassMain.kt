package com.basicinn.helloworld

import com.basicinn.helloworld.delegations.BgExecute
import com.basicinn.helloworld.delegations.BgTask
import com.basicinn.helloworld.delegations.TaskManager

class ClassMain {


    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            //var & val
            val studentId = 11 //immutable
            //studentId = 10 gives error when reassigning
            var name = "dev" // mutable
            name = "Dev"

            var id = 7
            id = 10

            println("Hello $name! id : $id")
            //var & val

            println("Addition: ${add(4, 7)}")
            println("Addition2: ${add(1, 6, 9)}")

            //if-else---
            var msg = if(id == 10) "Admin" else "Member"
            println("User is: $msg")
            var status = "";
            if (id > 7){
                status = "Passed"
            }else if(id > 3){
                status = "Waiting"
            }else{
                status = "Fail"
            }

            println("User status: $status")
            //---if-else

            //when---
            when(id){
                10->{
                    status = "Passed"
                }
                4->{
                    status = "Waiting"
                }
                2->{
                    status = "Failed"
                }
            }

            println("User status2: $status")

            when{
                id > 7 ->{
                    status = "Passed"
                }
                id > 3 ->{
                    status = "Waiting"
                }
                else ->{
                    status = "Failed"
                }
            }
            println("User status3: $status")
            //---when

            //for loop ---
            for(i in 0..5){
                println(i)
            }

            for (i in 0 until 5){
                println(i)
            }

            for (i in 5 downTo 0){
                println(i)
            }

            for (i in 0 .. 4 step 2){
                println(i)
            }

            var arrList = ArrayList<Int>()
            arrList.add(5)
            arrList.add(2)
            arrList.add(7)
            arrList.add(1)
            arrList.add(10)

            for(i in arrList){
               println(i)
            }
            //---for loop

            //while & do-while---
            var num = 10
            while (num<15){
                println("Num is: $num")
                num++;
            }


            var num2 = 10;
            do {
                println("Num2 is: $num2")
            }while (num2 > 11)
            //---while & do-while

            //Pair---
            var(a, b) = Pair(1, "Yes")
            println("$a $b")

            val newName = Pair("Raman", 2)
            println("${newName.first}   ${newName.second}")

            val newName2 = Pair("Raman", Pair("Ram", 7))
            println("${newName2.first} ${newName2.second.first}")
            //---Pair

            //---Triple
            val(x, y, z) = Triple(1, "Om", true)
            println("$x $y $z")

            val numTriple = Triple("Hello", "Wrold", Triple("Hi", true, 7))
            println(numTriple)
            println("${numTriple.first}")
            println("${numTriple.second}")
            println("${numTriple.third}")
            //---Triple

            //Class---
            val kb = KotlinBasic(7, 11)
            println("The Number is: ${kb.someInt}")
            println("The Sum is: ${kb.Add(7,9)}")
            //---Class

            //primary & secondary constructor---
            val kb2 = KotlinBasic(11, 22, 33)
            val kb3 = KotlinBasic(b = 7)
            val kb4 = KotlinBasic(b = 9, c = 11)
            //---Primary & Secondary Constructor

            //Companion Object---
            val kb5 = KotlinBasic()
            println("SomeInt is: " + kb5.someInt)
            println("Sum is: " + kb5.Add(7, 12))

            println("Second No is: " + KotlinBasic.secondNo)
            println("Product is: " + KotlinBasic.product(7, 12))
            //---Companion Object

            //inheritance---
            val kotlinAdvanced = KotlinAdvanced()
            println("Inherited SomeInt is: " + kotlinAdvanced.someInt)
            println("Inherited Sum is: " + kotlinAdvanced.Add(4,5))

            val kotlinBasic = KotlinBasic()
            println("SomeInt is: ${kotlinBasic.someInt}, Overidden SomeInt is: ${kotlinAdvanced.someInt}" )
            println("Sum is: ${kotlinBasic.Add(4,5)}, Overridden Sum is: ${kotlinAdvanced.Add(4,5)}")
            //---Inheritance

            //This & Super Keywords---
            val audi = Audi()
            audi.interior(12345)
            //---This & Super Keywords

            //interface---
            val classA = ClassA()
            val classB = ClassB()

            println("The no is: ${classA.firstNo}, ${classB.firstNo}")
            println("The sum of two is: ${classA.add(9,10)}, ${classB.add(9, 10)}")
            println("The sum of three is: ${classA.add(9, 10, 11)}, ${classB.add(9, 10, 11)}")
            //---interface

            //abstract class---
            val classC = ClassC()
            println("abstract Product is: " + classC.product(7, 8))
            //---abstract class

            //Enum---
            for (day in Days.entries){
                if(day.holiday){
                    println("$day is holiday")
                }
            }
            //---Enum

            //Generics---
            val genClass = GenClass("Hello World")
            val genClass2 = GenClass(true)
            val genClass3 = GenClass(99)
            //---Generics

            //Lambdas---
            val myVal = 7
            println("The square of $myVal is: " + sqr(myVal))

            println("The lambda sum is: " + lambAdd(21,32))

            println("The lambda product is: " + lambProduct(4, 6))

            printName()

            printString("How are you doing!")
            //---Lambdas

            //High Order Functions---
            highOrder(printName)
            highAdd(lambAdd)
            //---High Order Functions

            //High Order Class---
            val highClass = HighClass(printString)
            //---High Order

            //Delegation---
            val taskName = "Download File"
            val taskManager = TaskManager(BgTask(taskName), BgExecute(taskName)) //using delegation in TaskManager Class
            taskManager.Create()
            taskManager.Execute()
            //---Delegation

            //Scope Functions---
            val user = User().apply {
                this.name = "John"
                age = 25
            }


            //returns lambda
            val age = with(user){
                println("Name of the user is: " + this.name)
                age
            }
            println("The Age Of user is: " + age)

            //can make changes in object , returns object
            user.also {
                it.name = "Harry"
                println("The name has changed")
            }
            println("The Name is: " + user.name)

            var myName: String? = null
            myName = "Andy"

            //let makes null safe
            myName?.let {
                println( "The length of he name is: "+ myName.length)
                println("The name is:" + it)
                println("The reversed name is: " + it.reversed())
            }

            val user2: User? = null
            //with + let == run
            val message = user2.run {
                println("The name of the user is: " + name)
                age
                "Run Scope Function"
            }

            println("The msg is: " + message)
            //---Scope Functions

        // Collections---
            //List
            //immutable list
            val aList = listOf("Chandan", "Shivam", 1, 1.3, true, listOf( 1, 2, true))
            println("immutable list: " + aList)

            //mutable list
            val mList = mutableListOf<Any>("Raman", "Rajeev")

            mList.add("Ramiz")
            mList.add(7)
            mList.add(0, "Ramanujan")

            val m2List = listOf(7, 9, 11)
            mList.addAll(m2List)

            println()
            println("mutable list: " + mList)

            //set ///unique values///
            //immutable set
            val aSet = setOf("12", 1, "Raj", "Ram", true, true, "Raj")
            println("immutable set: " + aSet)

            //mutable list
            val mSet = mutableSetOf("Raj", "Rajeev", "Mohan", true, 1, 2, "Raj", 1)
            mSet.add(7)
            mSet.add(false)
            mSet.add("Mohan")

            val m2Set = setOf(true, 36, "India")
            mSet.addAll(m2Set)

            println("Mutable Set: $mSet")

            //map
            val aMap = mapOf(1 to "Raman", 10 to "Rahul", true to "Check")
            println("Map is: " + aMap)

            //mutable map
            val mMap = mutableMapOf<Int, String>()

            val m2Map = mapOf(1 to "Raj", 12 to "Rohit", 11 to "Rajeev")
            mMap.putAll(m2Map)
            mMap[1] = "Raman"
            println("Mutable Map: " + mMap)

            //arraylist
            val arrNames = ArrayList<String>()
            arrNames.add("A")
            arrNames.add("B")
            arrNames.add("C")

            arrNames[0] = "Raman"
            arrNames.removeAt(1)
            println("arrList: " +arrNames.toString())
        //---Collections

        //Nullability---
            var name3: String? = null
            name3?.let {
                println("The name3 is: " + name3.length)
            }
        //---Nullability
        }

        //methods---
        private fun add(a: Int, b: Int): Any{
            return  a+b
        }

        private fun add(a: Int, b: Int, c: Int): Any{
            return  a+b+c
        }
        //---methods

        //Lambda Function
        val sqr = {x: Int -> x * x}

        //Lambda Function
        val lambAdd = {x:Int, y: Int -> x + y}

        //Lambda Function
        val lambProduct:(Int, Int) -> Int = { x, y -> x * y }

        //Lambda Function
        val printName = { println("Hello, Android Devs") }

        //Lambda Function
        val printString: (String) -> Unit = { str -> println("My String is: $str") }

        //Lambda Function
        val retFunc = {a: Int , b: Int -> "The sum is: " + (a + b)}

        //High Order Function
        fun highOrder(func: () -> Unit){
            func()
        }

        //High Order Function
        fun highAdd(addFunc: (Int, Int) -> Int): (Int, Int) -> String{
            println("The high Sum is: " + addFunc(33, 44))
            return  retFunc
        }
    }
}