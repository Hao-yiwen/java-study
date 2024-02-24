package org.example

internal class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevices(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(2, 0, 100)

    private var channelNumber by RangeRegulator(1, 0, 200)

    fun increaseSpeakerVoulme() {
        this.speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        this.channelNumber++
        println("Channel changed to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}