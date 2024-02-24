package org.example

class SmartDevice(val name: String, val category: String) {
//    val name = "Android TV"
//    val category = "Entertainment"
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int): this(name, category){
        deviceStatus = when(statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    var speakerVolumn = 2
        set(value) {
            if(value in 0..100){
                field = value
            }
        }
        get() = field

    fun turnOn(){
        println("smart device is turned on")
    }

    fun turnOff(){
        println("smart device is turned off")
    }
}

fun main(){
    val smartDevice = SmartDevice("Android TV", "Entertainment")
    println("Device name: ${smartDevice.name}")
    smartDevice.speakerVolumn = 200
    println("${smartDevice.speakerVolumn}")
    smartDevice.turnOn()
    smartDevice.turnOff()
    println("Device status: ${smartDevice.deviceStatus}")
}