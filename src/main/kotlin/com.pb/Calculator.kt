package com.pb

class Calculator {

    fun add(a: Int, b: Int) : Int{
        return a + b
    }


    fun add(a: String, b: String) : Int{
        return a.toInt() + b.toInt()
    }


}