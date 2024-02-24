package org.example1

import org.example.SmartDevices
import org.example.SmartLightDevice
import org.example.SmartTvDevice

class SmartDevicesTest {
}

fun main(){
    var smartDevice: SmartDevices = SmartTvDevice("SmartTv", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("SmartLight", "Home")
    smartDevice.turnOn()
}