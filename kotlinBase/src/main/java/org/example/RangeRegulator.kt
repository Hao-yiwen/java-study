package org.example

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(initialValue: Int, private val minValue: Int, private val maxValue: Int) :
    ReadWriteProperty<Any?, Int> {
    var field = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return field
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            field = value
        }

    }
}

fun main() {
    var number:Int by RangeRegulator(10, 0, 100)
    number = 9
    println(number)
    number = 900
    println(number)
}