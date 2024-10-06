package com.basednihilus.kotlincourse.lesson10

fun main() {


    println("----задача 1----")
    val list1 = listOf<Int>()
    println(list1)


    println("----задача 2----")
    val list2 = listOf("Hello", "World", "Kotlin")
    println(list2)


    println("----задача 3----")
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    println(list3)


    println("----задача 4----")
    val list4 = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)
    println(list4)


    println("----задача 5----")
    val list5 = mutableListOf("Disney", "World", "is", "shittiest", "studio", "in", "the", "world")
    list5.remove("World")
    println(list5)


    println("----задача 6----")
    val list6 = listOf(11, 12, 13, 14, 15)
    for (i in list6){
        println(i)
    }


    println("----задача 7----")
    val list7 = listOf("Мама", "мыла", "раму")
    println(list7[1])


    println("----задача 8----")
    val list8 = mutableListOf("Папа ", "у ", "Васи ", "силен ", "в ", "математике")
    list8[2] = "Пети "
    print(list8)


    println("----задача 8----")
    val list9 = listOf("one", "two", "three")
    val secondList9 = listOf("four", "five", "six")
    val unitedList = mutableListOf<String>()
    for (element in list9){
        unitedList.add(element)
    }
    for (element in secondList9){
        unitedList.add(element)
    }
    println(unitedList)


    println("----задача 10----")
    val list10 = listOf(0, 12, 213, 1, 22, -10, 155)
    var minValue = 0
    var maxValue = 0
    for (i in list10) {
        if (i < minValue) {
            minValue = i
        }
        if (i > maxValue) {
            maxValue = i
        }
    }
    println("Минимальное значение равно: $minValue")
    println("Максимальное значение равно: $maxValue")



    println("----задача 11----")
    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    val evenList = mutableListOf<Int>()
    for (i in list11){
        if (i % 2 == 0){
            evenList.add(i)
        }
    }
    println(evenList)

}