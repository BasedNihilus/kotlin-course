package com.basednihilus.kotlincourse.lesson18.homework.printers

import com.basednihilus.kotlincourse.lesson18.printColored

abstract class Printer () {
    abstract fun print(str: String)

    protected fun printText(str: String, color: String, backgroundColor: String) {
        val words = str.split(" ")
        words.forEach { word -> printColored(word, color, backgroundColor) }
    }
}