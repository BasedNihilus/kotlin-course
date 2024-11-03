package com.basednihilus.kotlincourse.lesson18.homework.animals

import com.basednihilus.kotlincourse.lesson18.homework.printColored

abstract class Animal() {
    abstract fun makeSound(sound: String)

    protected fun makeSound (sound: String, color: String){
        printColored("This animal makes no sound.", color)
    }
}