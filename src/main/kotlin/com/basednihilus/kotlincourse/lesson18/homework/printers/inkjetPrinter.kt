package com.basednihilus.kotlincourse.lesson18.homework.printers

import com.basednihilus.kotlincourse.lesson18.homework.Background
import com.basednihilus.kotlincourse.lesson18.homework.Colors

class inkjetPrinter() : Printer() {
    val colorPairs = listOf(
        Colors.BLACK to Background.WHITE,
        Colors.WHITE to Background.BLACK,
        Colors.YELLOW to Background.CYAN,
        Colors.RED to Background.YELLOW,
        Colors.BLUE to Background.GREEN,
        Colors.PURPLE to Background.RED,
        Colors.CYAN to Background.BLUE,
        Colors.GREEN to Background.PURPLE
    )
    override fun print(str: String) {
        val words = str.split(" ")
        var colorIndex = 0

        for (word in words) {
            val textColor = colorPairs[colorIndex].first
            val backgroundColor = colorPairs[colorIndex].second
            printText(word, textColor, backgroundColor)
            colorIndex++
            if (colorIndex >= colorPairs.size) {
                colorIndex = 0
            }
        }
    }
}