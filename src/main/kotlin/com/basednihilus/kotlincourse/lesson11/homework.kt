package com.basednihilus.kotlincourse.lesson11

fun main() {

    println("-----Задание 1-----")
    val map1 = mapOf<Int, Int>()
    println(map1)

    println("-----Задание 2-----")
    val map2 = mapOf<Float, Double>(1f to 1.0, 2f to 2.0, 3f to 3.0)
    println(map2)

    println("-----Задание 3-----")
    val map3 = mutableMapOf<Int, String>()
    println(map3)

    println("-----Задание 4-----")
    val list1 = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
        "u", "v", "w", "x", "y", "z")
    val map4 = mutableMapOf<Int, String>()
    for (i in list1.indices) {
        map4[i] = list1[i]
    }
    println(map4)

    println("-----Задание 5-----")
    println(map4[1])
    println(map4[33])

    println("-----Задание 6-----")
    map4.remove(10)
    println(map4)

    println("-----Задание 7-----")
    val key1 = listOf<Double>(15.32, 14.09, 21.14, 67.95, 13.33, 19.60, 9.75, 61.70, 79.20, 66.56)
    val value1 = listOf<Int>(59, 35, 19, 15, 13, 16, 60, 0, 89, 68)
    var map7 = mutableMapOf<Double, Int>()
    println(sort(key1, value1, map7))


    println("-----Задание 8-----")
    var map8 = mutableMapOf<Int, String>(1 to "Лупа", 2 to "получил", 3 to "за", 4 to "Пупу")
    println(map8)
    map8[1] = "Пупа"
    map8[4] = "Лупу"
    println(map8)

    println("-----Задание 10-----")
    val map10 = mapOf<String, List<Int>>("один" to listOf(1, 2, 3), "два" to listOf(4, 5, 6))
    println(map10)

    println("-----Задание 11-----")
    val set1 = mutableSetOf("Яблоко", "Банан", "Вишня")
    val set2 = mutableSetOf("Апельсин", "Виноград", "Черешня")
    val set3 = mutableSetOf("Гвоздь", "Камень", "Электродрель")
    val map11 = mapOf<Int, MutableSet<String>>(1 to set1, 2 to set2, 3 to set3)
    println(map11)
    val updSet3 = map11[3]
    updSet3?.add("Кочегар")
    println(updSet3)
    println(map11)

    println("-----Задание 11-----")
    val pair1 = 1 to 2
    val pair2 = 3 to 4
    val pair3 = 5 to 6
    val pair4 = 7 to 5
    val map12 = mapOf(pair1, pair2, pair3, pair4)
    println(fivePair(map12))


    val map13 = mutableMapOf<String, MutableList<String>>()

    val map14 = mutableMapOf<String, List<String>>()

    val map15 = mutableMapOf<String, MutableList<String>>()

    val map16 = mutableMapOf<Long, MutableList<String>>()

    val map17 = mutableMapOf<String, MutableMap<String, MutableList<String>>>()
}

fun sort(key1: List<Double>, value1: List<Int>, map7: MutableMap<Double, Int>): List<String> {
    var tempList = mutableListOf<String>()
    for (i in key1.indices) {
        map7[key1[i]] = value1[i]
    }
    for ((k, v) in map7) {
        if (v != 0) {
            tempList.add((k / v).toString())
        } else tempList.add("жопа")
    }
    return tempList
}

fun fivePair(map12: Map<Int, Int>): Any {
    val pairsList = mutableListOf<String>() // Список для хранения строк с парами
    for ((k, v) in map12) {
        if (k == 5 || v == 5) {
            pairsList.add("$k: $v")
        }
    }
    if (pairsList.isNotEmpty()) return pairsList
    else return "нет таких пар"
}