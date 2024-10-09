package com.basednihilus.kotlincourse.lesson10

fun main() {

    println("task1")
    val list1 = List(0) {0}
    println(list1)

    println("task2")
    val list2 = listOf<String>("Hello", "World", "Kotlin")
    println(list2)

    println("task3")
    var list3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(list3)

    println("task4")
    list3.add(6)
    list3.add(7)
    list3.add(8)
    println(list3)

    println("task5")
    var list5 = mutableListOf<String>("Hello", "World", "Kotlin")
    list5.remove("World")
    println(list5)

    println("task6")
    val list6 = listOf<Int>(1, 2, 3, 4, 5)
    for (i in list6.indices) {
        println(list6[i])
    }

    println("task7")
    val list7 = listOf<String>("Hello", "World", "Kotlin")
    println(list7[1])

    println("task8")
    var list8 = mutableListOf<Int>(1, 2, 3, 4, 5)
    list8[1] = 6
    println(list8)

    println("task9")
    val list9 = listOf<String>("Hello", "World", "Kotlin")
    val list91 = listOf<String>("Hi", "Earth", "Java")
    var list92 = mutableListOf<String>()
    for (i in list9) {
        list92.add(i)
    }
    for (i in list91) {
        list92.add(i)
    }
    println(list92)

    println("task10")
    val list10 = listOf<Int>(1, 2, 3, 4, 5)
    for (i in list10)
        if (i == 1 || i == 5) {
            println(i)
        }

    println("task101")
    var list101 = listOf<Int>(10, 31, 22, 53, 44)
    list101 = list101.sorted()
    println(list101[0])
    println(list101[list101.size - 1])

    println("task11")
    val list11 = listOf<Int>(10, 31, 22, 53, 44)
    var list111 = mutableListOf<Int>()
    for (i in list11)
        if (i % 2 == 0) {
            list111.add(i)
        }
    println(list111)
}