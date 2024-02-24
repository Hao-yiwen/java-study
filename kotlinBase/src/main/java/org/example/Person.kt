package org.example

fun main(){
    val xiaoming = Person("xiaoming")
//    println("${xiaoming.age} ${xiaoming.city}")
    val lili = Person("lili", 18)
//    println("${lili.age} ${lili.city}")
    val hanmeimei = Person("hanmeimei", 20, "beijing")
//    println("${hanmeimei.age} ${hanmeimei.city}")
}

class Person(val name: String) {
    init {
        println("First init block: $name")
    }
    var age: Int = 0
    var city: String = "shanghai"


    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("First secondary constructor: $age")
    }

    constructor(name: String, age: Int, city: String) : this(name) {
        this.age = age
        this.city = city
        println("Second secondary constructor: $city")
    }
    init {
        println("Second init block: $city")
    }
}
