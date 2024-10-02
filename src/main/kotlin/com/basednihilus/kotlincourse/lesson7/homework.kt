package com.basednihilus.kotlincourse.lesson7

fun main() {

    for (i in 1..5) {
        println(i)
    }

    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i - 2)
    }

    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 1..20 step 3) {
        if (i != 1)
        println(i - 1)
    }

    for (i in 1 until 9) {
        println(i)
    }

    for (i in 3 until 15) {
        println(i)
    }

    var item = 1
    while (item <= 5) {
       println(item * item)
        item++
    }

    var item2 = 10
    while (item2 >= 5) {
        println(item2)
        item2--
    }

    var item3 = 5
    do {
        println(item3)
        item3--
    } while (item3 >= 1)

    var item4 = 5
    do {
        println(item4)
        item4++
    } while (item4 < 10)

    for (i in 1..10) {
        if (i == 6) {
            break
        }
    }

    var item5 = 1
    while (item5 >= 1) {
        if (item5 == 10) {
            break
        }
        else {
            println(item5)
            item5++
        }
    }

    for (i in 1..10) {
        if (i % 2 == 0){
            continue
        }
    }

    var item6 = 1
    while (item6 <= 10) {
        if (item6 % 3 == 0) {
            continue
        }
        else {
            println(item6)
            item6++
        }
    }

}

