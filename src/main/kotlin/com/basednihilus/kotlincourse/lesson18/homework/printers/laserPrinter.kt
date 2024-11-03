package com.basednihilus.kotlincourse.lesson18.homework.printers

import com.basednihilus.kotlincourse.lesson18.homework.Background
import com.basednihilus.kotlincourse.lesson18.homework.Colors
import com.basednihilus.kotlincourse.lesson18.homework.printColored

class laserPrinter() : Printer() {
    override fun print(str: String) {
        printText(str, Colors.BLACK, Background.WHITE)
    }
}