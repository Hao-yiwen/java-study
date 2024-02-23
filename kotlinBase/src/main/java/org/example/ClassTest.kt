package org.example

class ClassTest(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun main() {
    val test = ClassTest(5.0, 2.0)
    println("result is ${test.perimeter}")
}