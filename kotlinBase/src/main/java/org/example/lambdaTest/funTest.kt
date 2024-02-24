package org.example.lambdaTest

fun tick() {
    println("tick test")
}

fun main() {
    exectorFun(::tick)
}

fun exectorFun(action: () -> Unit) {
    action()
}