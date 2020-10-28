package com.example.kotlinintermedio

class MyNestedAndInnerClass {

    private val one = 1

    private fun retuntOne() : Int {
        return one
    }

    // Clase anidada
    class MyNestedClass{

        fun sum(firts:Int, second : Int): Int{
            return firts + second

        }

    }
    inner class MyInnerClass{
        fun sumOTwo(number:Int):Int{
            return number + one + retuntOne()
        }
    }
}