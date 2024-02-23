package org.example

fun main() {

    val items = setOf("apple", "banana", "dsad")
    when {
//        "apple" in items -> println("ahhha")
    }
    for (item in items) {
//        println(item)
    }
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it -> it.startsWith("a") }
//            .sortedBy { it }
//            .map { it.uppercase() }
            .forEach { it->println(it) }
}