package org.example

val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun main() {
//    只读局部变量 相当于let
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    println("a=$a, b=$b, c=$c")

//    可重新赋值的var关键字
//    var x = 5
//    x =6
//    println("x = $x")

    println("x=$x;PI=$PI")
    incrementX()
    println("incrementX")
    println("x=$x;PI=$PI")
}