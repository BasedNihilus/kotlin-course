package com.basednihilus.kotlincourse.lesson10

fun main() {

    println("task1")
    val set1 = setOf<Int> ()
    println(set1)

    println("task2")
    val set2 = setOf<Int> (1, 2, 3)
    println(set2)

    println("task3")
    val set3 = mutableSetOf<String> ("Kotlin", "Java", "Scala")
    println(set3)

    println("task4")
    set3.add("Swift")
    set3.add("Go")
    println(set3)

    println("task5")
    val set5 = mutableSetOf<Int> (1, 2, 3)
    set5.remove(2)
    println(set5)

    println("task6")
    val set6 = setOf<Int> (1, 2, 3)
    for (i in set6) {
        println(i)
    }

    println("task7")
    val stringSet = setOf<String> ("Hello", "World")
    println(task7(stringSet, "Hell"))

    println("task8")
    val set8 = setOf<String> ("Hello", "World", "Korlin")
    val set81 = setOf<String> ("Hi", "Earth", "Java", "World")
    var set82 = mutableSetOf<String>()
    for (i in set8) {
        set82.add(i)
    }
    for (i in set81) {
        set82.add(i)
    }
    println(set82)

    println("task9")
    val set9 = setOf<Int> (1, 2, 3, 4)
    val set91 = setOf<Int> (4, 3, 6, 7)
    for (i in set9) {
        if (i in set91) {
            println(i)
        }
    }

    println("task10")
    val set10 = setOf<String> ("Kotlin", "Two", "Three", "Hello")
    val set101 = setOf<String> ("Four", "Five", "Six", "Hello")
    for (i in set10) {
        if (i !in set101) {
            println(i)
        }
    }

    println("task11")
    val set11 = setOf<String> ("Four", "Five", "Six", "Hello")
    var list11 = mutableListOf<String> ()
    for (i in set11) {
        list11.add(i)
        }
    println(list11)

}

fun task7(stringSet: Set<String>, stringString: String): Any {
    var totalResult: Boolean = false
    for (i in stringSet) {
        if (i == stringString) {
            totalResult = true
        }
    }
    return totalResult
    }