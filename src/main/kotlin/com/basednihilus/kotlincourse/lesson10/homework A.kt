package com.basednihilus.kotlincourse.lesson10

fun main() {

    println("task1")
    val array1 = arrayOf<Int> (1, 2, 3, 4, 5)
    println(array1.toList())

    println("task2")
    val array2 = Array(10) { "" }
    println(array2.toList())

    println("task2.1")
    val array21 = arrayOfNulls<Int>(10)
    println(array21.toList())

    println("task3")
    val array3 = arrayOf<Double> (0.0, 2.0, 4.0, 6.0, 8.0)
    println(array3.toList())

    println("task3.1")
    val array31 = Array<Double>(5) { i-> i * 2.0 }
    println(array31.toList())

    println("task4")
    val array4 = Array(5) { 0 }
        for (i in array4.indices) {
            array4[i] = i * 3
        }
    println(array4.toList())

    println("task5")
    val array5 = arrayOf<String?>(null, "", "")
    println(array5.toList())

    println("task6")
    val array6 = Array<Int>(10) {i-> i + 1}
    val array61 = Array<Int>(10) {i-> i - 1}
    for (i in array6.indices) {
            array61[i] = array6[i]
    }
    println(array6.toList())
    println(array61.toList())

    println("task7")
    val array7 = Array<Int>(10) {i-> i + 1}
    val array71 = Array<Int>(10) {i-> i + 1}
    val array72 = Array<Int>(10) {i-> i + 1}
    for (i in array72.indices) {
        array72[i] = array7[i] - array71[i]
    }
    println(array72.toList())

    println("task8")
    val array8 = Array<Int>(5) {i-> i + 1}
    var item88 = 0
    while (item88 <= array8.lastIndex) {
        if (array8[item88] == 5) {
            println(item88)
        } else if (array8.size != 5) {
            println(-1)
        }
        item88++
    }

    println("task9")
    val array9 = arrayOf(5, 6, 7, 8, 9)
    for (i in 0..4)
        if (i % 2 == 0) {
            println(array9[i].toString() + "Odd")
        } else {
            println(array9[i].toString() + "Even")
        }

    println("task10")
    val stringArray= arrayOf<String> ("Hello", "World")
    println(task10(stringArray, "Hello"))

}

    fun task10(stringArray: Array<String>, searchString: String): Any {
        var totalResult: String = ""
        for (i in stringArray) {
             if (i.contains(searchString)) {
                 totalResult = searchString
             }
             }
                 return totalResult
        }