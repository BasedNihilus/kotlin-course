package com.basednihilus.kotlincourse.lesson18.homework.animals

import com.basednihilus.kotlincourse.lesson18.homework.Colors
import com.basednihilus.kotlincourse.lesson18.homework.printColored

class Bird() : Animal() {
    override fun makeSound(sound: String) {
        printColored(sound, Colors.RED)
    }
}