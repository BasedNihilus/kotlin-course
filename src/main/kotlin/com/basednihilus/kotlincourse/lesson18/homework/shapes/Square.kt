package com.basednihilus.kotlincourse.lesson18.homework.shapes

class Square(val side: Double) : Shape() {
    override fun figureArea(): Double {
        return side * side
    }
}