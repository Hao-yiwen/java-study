package org.example

 class PrivateClassTest {
    fun test() {
        println("PrivateClassTest")
    }
}

fun main(){
    val privateClassTest = PrivateClassTest()
    privateClassTest.test()
}