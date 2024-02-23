package org.example

// fun方式
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

// 简写方式
//fun sum(a: Int, b: Int) = a + b

// 返回无意义的值的函数
fun printSum(a: Int, b: Int):Unit{
    println("$a and $b is ${a + b}")
}

fun main() {
//    val favoriteActor = null
//    favoriteActor = "dasd"
//    println("sum of 3 and 5 is")
//    println(sum(3, 5))
    printSum(3,5)
}