package org.example

internal class SmartHome(val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTVVolume() {
        smartTvDevice.increaseSpeakerVoulme()
    }

    fun nextTVChannel() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun changeLightColor() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOffLight()
    }
}