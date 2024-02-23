package org.example

fun getStringLength(obj: Any):Int?{
    if(obj is String){
        return obj.length
    }
    return null
}

fun main(){
    fun printLength(obj:Any){
        println("Getting the length of '$obj'.Result: ${getStringLength(obj)?:"Error: The object is not a string"}")
    }
    printLength("dsadasdasdas")
    printLength(10000)
    printLength(listOf(Any()))
}