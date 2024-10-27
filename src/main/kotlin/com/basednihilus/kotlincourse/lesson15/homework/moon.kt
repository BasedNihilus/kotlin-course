package com.basednihilus.kotlincourse.lesson15.homework

object Moon {
    var isVisible: Boolean = false
    var phase: String = "New Moon"

    fun showPhase(){
        if (isVisible) {
            phase = "Full Moon"
        }
        println(phase)
    }
}