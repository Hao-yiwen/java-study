package org.example.lambdaTest

fun operate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val result = operate(2, 3){
            x,y->x+y
    }
    println(result) // 输出：5
}

val test: (String?, Int, String) -> Int? = { it, number, str ->
    it?.toIntOrNull()
}