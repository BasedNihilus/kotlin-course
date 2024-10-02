package com.basednihilus.kotlincourse.lesson5

fun main() {
    val soundIntensity1 = calculateSoundIntensity(10.0, 0.7)
        println(soundIntensity1)
    val soundIntensity2 = calculateSoundIntensity(10.0, null)
        println(soundIntensity2)

    val deliveryCost1 = calculateDeliveryCost(100.0)
        println(deliveryCost1)
    val deliveryCost2 = calculateDeliveryCost(null)
        println(deliveryCost2)

    val AtmosphericPressure1 = checkAtmosphericPressure( 10.0, null)
        println(AtmosphericPressure1)
    val AtmosphericPressure2 = checkAtmosphericPressure(null, 10.0)
    println(AtmosphericPressure2)


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

fun checkAtmosphericPressure(atmospherePressure: Double?, temperatureStatus: Double?): String {
    val meteoData = atmospherePressure ?: false
    if (meteoData != false) {
        return "Everything is okay"
    }
    else
    {
        return "Error"
    }
}