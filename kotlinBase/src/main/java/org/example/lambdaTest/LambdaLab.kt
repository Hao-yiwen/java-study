package org.example.lambdaTest

fun main() {
    val trickFun = trickOrTreat(true, null)
    val treatFun = trickOrTreat(false) {
        println("Extra treats: $it")
    }
    treatFun()
    trickFun()
    repeat(5){
        treatFun()
    }
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> Unit)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            extraTreat(5)
        }
        return treat
    }
}

val trick = {
    println("No treats")
}

val treat = {
    println("Have a treat!")
}