package com.basednihilus.kotlincourse.lesson20

class FridgeDevice : TemperatureControlledOpeningDevice() {
    override var maxTemperature: Int = 8

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn()) {
            println("Не могу установить температуру. Холодильник выключен")
            return
        }
        super.setTemperature(temp)
    }

    override fun programAction(action: String) {
        if (!isPoweredOn()) {
            println("Не могу запрограммировать. Холодильник выключен.")
            return
        }
        super.programAction(action)
    }
}