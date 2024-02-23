package org.example

//构造函数继承
class InstanceTest(message:String):ExtendTest(message) {
    override fun greet() {

        println("hello from child")
        super.greet()
    }
}

fun main(){
    var test=InstanceTest("dsad")
    test.greet()
}