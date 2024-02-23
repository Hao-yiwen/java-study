package org.example

fun main() {
//    if
    println(1 == 1)
    println(1 < 1)
    println("Hello, World!")
    val trafficLightColor = "green";
    if (trafficLightColor === "red") {
        println("红灯停")
    } else if(trafficLightColor === "green"){
        println("绿灯行")
    }
//    when
    when(trafficLightColor){
        "red"-> println("红灯停")
        "green"->println("绿灯行")
        else -> println("此灯无效")
    }
//    better when
    val number:Any = 20
    val test =when(number){
        1,2,4,5 -> println("没错，正是这些数字")
        in 1..10-> println("你猜对了")
        is Int -> println("是数字，但是不知道是否在1~10之间")
        else -> println("啦啦啦")
    }
//    提取println
    val message = when(number){
        1,2,3,4,5 -> "你猜对了"
        is Int -> "啦啦啦"
        else -> "dsadsa"
    }
    println(message)
}
