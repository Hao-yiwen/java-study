package org.example

internal open class SmartDevices protected constructor(val name: String, val category: String) {
    var deviceStatus = "online"
        private set

    open val deviceType = "unknow"
    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}