package com.basednihilus.kotlincourse.lesson20

fun main() {

    val fridge = FridgeDevice()
    val washingMachine = WashingMachine()
    val kettle = Kettle()
    val oven = Oven()

    println("ХОЛОДОС")
    fridge.setTemperature(5)
    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.programAction("СРЕДНЕЕ ОХЛАЖДЕНИЕ")
    fridge.execute()
    fridge.powerOff()

    println("СТИРАЛКА")
    washingMachine.fillWater(30)
    washingMachine.setTemperature(40)
    washingMachine.powerOn()
    washingMachine.setTemperature(40)
    washingMachine.setTimer(60)
    washingMachine.programAction("ГЛУБОКАЯ СТИРКА")
    washingMachine.execute()
    washingMachine.drain()
    washingMachine.powerOff()

    println("ЧАЙНИК")
    kettle.fillWater(1)
    kettle.setTemperature(90)
    kettle.powerOn()
    kettle.setTemperature(90)
    kettle.programAction("ПОДОГРЕВ")
    kettle.execute()
    kettle.getWater(0.5.toInt())
    kettle.powerOff()


    println("ДУХОВКА")
    oven.setTemperature(180)
    oven.powerOn()
    oven.setTemperature(180)
    oven.programAction("ПИРОЖКИ")
    oven.execute()
    oven.powerOff()
}