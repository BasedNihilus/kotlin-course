package com.basednihilus.kotlincourse.lesson5

fun main() {

    val initialIntensity = 100.0
    val knownDampingCoefficient: Double? = 0.7
    val intensityWithKnownCoefficient = calculateDampedSoundIntensity(initialIntensity, knownDampingCoefficient)
    println("Интенсивность звука с известным коэффициентом затухания: $intensityWithKnownCoefficient")

    val unknownDampingCoefficient: Double? = null
    val intensityWithUnknownCoefficient = calculateDampedSoundIntensity(initialIntensity, unknownDampingCoefficient)
    println("Интенсивность звука с неизвестным коэффициентом затухания: $intensityWithUnknownCoefficient")

    val cargoValue: Double? = null
    val totalCost = calculateTotalShippingCost(cargoValue)

    println("Полная стоимость доставки: $${"%.2f".format(totalCost)}")
    println(calculateTotalShippingCost(300.0))
    getPressureReading("v,dbfj")
    getPressureReading(null)
}

fun calculateDampedSoundIntensity(initialIntensity: Double, dampingCoefficient: Double?): Double {
    val effectiveDampingCoefficient = dampingCoefficient ?: 0.5
    return initialIntensity * effectiveDampingCoefficient
}


fun main1() {
    val cargoValue: Double? = null
    val totalCost = calculateTotalShippingCost(cargoValue)
    println("Полная стоимость доставки: $${"%.2f".format(totalCost)}")
}

fun calculateTotalShippingCost(cargoValue: Double?): Double {
    val effectiveCargoValue = cargoValue ?: 50.0
    val insurance = effectiveCargoValue * 0.05
    val totalShippingCost = effectiveCargoValue + insurance
    return totalShippingCost
}


fun getPressureReading(report: String?) {
    println (report ?: throw Exception())
}