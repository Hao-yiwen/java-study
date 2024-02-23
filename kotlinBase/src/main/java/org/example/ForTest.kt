package org.example

fun main(){
    val items = listOf("a",1,"c")
//    for (item in items.indices){
//        println("$item ${items[item]}")
//    }
    var number =0
    while (number<items.size){
        println(items[number++])
    }
    val x = 10;
    if(x in 0..items.lastIndex){
        println("x在区间内")
    }
}