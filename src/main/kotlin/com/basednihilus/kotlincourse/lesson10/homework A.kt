package com.basednihilus.kotlincourse.lesson10

fun main() {

    println("---задача 1----")
    val array1 = arrayOf(1, 2, 3, 4, 5)
    println(array1.toList())


    println("---задача 2----")
    val array2 = Array(10) { "" }
    println(array2.toList())


    println("---задача 3----")
    val array3 = Array(5) { 0.0 }
    for (i in array3.indices) {
        array3[i] = (i * 2).toDouble()
    }
    println(array3.toList())


    println("---задача 4----")
    val array4 = Array(5) { 0 }
    for (i in array3.indices) {
        array4[i] = (i * 3)
    }
    println(array4.toList())


    println("---задача 5----")
    val array5 = arrayOfNulls<String?>(3)
    array5[0] = null
    array5[1] = "два"
    array5[2] = "три"
    println(array5.toList())


    println("---задача 6----")
    val array6 = arrayOf(1, 2, 3, 4, 5)
    val newArray6 = Array(5) { 0 }
    for (i in array6.indices) {
        newArray6[i] = array6[i]
    }
    println(newArray6.toList())


    println("---задача 7----")
    val array7 = arrayOf(3, 4, 5, 6, 7)
    val secondArray7 = arrayOf(1, 2, 3, 4, 5)
    val newArray7 = Array(5) { 0 }
    for (i in array7.indices) {
        newArray7[i] = array7[i] - secondArray7[i]
    }
    println(newArray7.toList())


    println("---задача 8----")
    val array8 = arrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    var i = 0
    while (i < array8.lastIndex) {
        if (array8[i] == 5) {
            println(array8[i])
        } else {
            println(-1)
        }
        i++
    }


    println("---задача 9----")
    val array9 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (index in array9.indices) {
        if (array9[index] % 2 == 0) {
            println("${array9[index]} - чётное")
        } else {
            println("${array9[index]} - нечётное")
        }
    }


    println("---задача 10----")
    val array10 = arrayOf("раз", "два", "три", "четыре", "пять" )
    val searchString = "четыре"
    println(search(array10, searchString))
}
fun search(array10: Array<String>, searchString: String?): String {
    if (searchString != null) {
        for (i in array10) {
            if (i.contains(searchString)) {
                return i
            } else{
                Unit
            }
        }
    }
    return "не найдено"
}