package com.basednihilus.kotlincourse.lesson7

fun main() {
    var item7 = 0
    var item8 = 0

    while (item7 <= 9) {
        item7++
        item8 = 0
        println()
            while (item8 <= 9) {
                item8++
                print(item7 * item8)
                print(" ")
            }
        }
}

