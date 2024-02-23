package org.example

open class ExtendTest(meaage: String) {
    init {
        println(meaage)
    }

    open fun greet(){
        println("hello from parent")
    }
}