package com.basednihilus.kotlincourse.lesson5

fun main() {
    val soundIntensity1 = calculateSoundIntensity(10.0, 0.7)
    val soundIntensity2 = calculateSoundIntensity(10.0, null)

    val deliveryCost1 = calculateDeliveryCost(100.0)
    val deliveryCost2 = calculateDeliveryCost(null)

    val pressureReadings1 = mapOf("temperature" to 25.0, "humidity" to 60.0, "atmospheric_pressure" to 1013.25)
    val pressureReadings2 = mapOf("temperature" to 25.0, "humidity" to 60.0)

    checkAtmosphericPressure(pressureReadings1)
    checkAtmosphericPressure(pressureReadings2)
}

fun calculateSoundIntensity(initialIntensity: Double, attenuationCoefficient: Double?): Double {
    val coefficient = attenuationCoefficient ?: 0.5
    return initialIntensity * coefficient
}

fun calculateDeliveryCost(goodsCost: Double?): Double {
    val cost = goodsCost ?: 50.0
    val insuranceCost = cost * 0.005
    return cost + insuranceCost
}

fun checkAtmosphericPressure(pressureReadings: Map<String, Double>) {
    val atmosphericPressure = pressureReadings["atmospheric_pressure"]
    if (atmosphericPressure == null) {
        println("Error: Atmospheric pressure reading is missing.")
    } else {
        println("Atmospheric pressure reading is present.")
    }
}
