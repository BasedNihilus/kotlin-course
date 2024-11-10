package com.basednihilus.kotlincourse.lesson20

abstract class SwitchableDevice : Powerable {
    private var isOn = false
    override fun powerOn() {
        isOn = true
        println("Девайс включен")
    }

    override fun powerOff() {
        println("Девайс выключен")
        isOn = false
    }

    protected fun isPoweredOn(): Boolean {
        return isOn
    }
}