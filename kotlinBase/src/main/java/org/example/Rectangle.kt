package org.example

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun main(){
    val test = Rectangle(3.toDouble(),5.0);
}