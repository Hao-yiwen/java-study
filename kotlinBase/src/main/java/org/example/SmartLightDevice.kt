package org.example

internal class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevices(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(0, 0, 100)

    fun increaseBrightness() {
        this.brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}