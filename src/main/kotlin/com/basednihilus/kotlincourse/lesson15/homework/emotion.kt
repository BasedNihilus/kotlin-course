package com.basednihilus.kotlincourse.lesson15.homework

class Emotion(
    val type: String,
    var intensity: Int
) {
    fun express() {
        val intensityDescription = when (intensity) {
            in 1..3 -> "слабая"
            in 4..6 -> "средняя"
            in 7..9 -> "сильная"
            10 -> "очень сильная"
            else -> "странная"
        }
        println("Эмоция: $type, Интенсивность: $intensityDescription")
    }
}