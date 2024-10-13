package com.basednihilus.kotlincourse.lesson12

fun main(){
    println("----Задание 1-----")
    println(funWithoutAnything())

    println("----Задание 2-----")
    println(adder(2, 2))

    println("----Задание 3-----")
    println(justString("Это просто строка"))

    println("----Задание 4-----")
    println(arithmeticMean(numbers = listOf(1, 2, 3, 4, 5)))

    println("----Задание 5-----")
    println(nullableString(null))

    println("----Задание 6-----")
    println(nullWithoutArgs())

    println("----Задание 7-----")
    println(nullList(numbers = listOf(1, 2, 3, null)))

    println("----Задание 8-----")
    println(intToNullString(1))

    println("----Задание 9-----")
    println(noArgsToNullListString())

    println("----Задание 10-----")
    println(allNull(null, null))

    println("----Задача 1-----")
    println(multiplyByTwo(2))

    println("----Задача 2-----")
    println(isEven(5))

    println("----Задача 3-----")
    println(printNumbersUntil(-1))

    println("----Задача 4-----")
    println(findFirstNegative(numbers = listOf(1, 2, 3, -4, 5)))

    println("----Задача 5-----")
    println(processList(ss = listOf("один", "два", "три", null, "пять")))

    println("----РЕФАКТОРИНГ----")
    drawRectangle(10, 5)
}

fun funWithoutAnything(){}

fun adder(a: Int, b: Int): Int = a + b

fun justString(s: String){}

fun arithmeticMean(numbers: List<Int>): Double {
    var sum = 0
    var counter = 0
    for (i in numbers.indices) {
        sum += numbers[i]
        counter++
    }
    return (sum / counter).toDouble()
}

fun nullableString(s: String?): Int? = s?.length

fun nullWithoutArgs(): Double? {
    return null
}

fun nullList(numbers: List<Int?>){}

fun intToNullString(n: Int): String?{
    return null
}

fun noArgsToNullListString(): List<String?>{
    return listOf("один", null, "два")
}

fun allNull(s: String?, n: Int?): Boolean {
    return true
}

fun multiplyByTwo(n: Int) = n * 2

fun isEven(n: Int) = n % 2 == 0

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

fun findFirstNegative(numbers: List<Int>): Int? {
    for (i in numbers) {
        if (i < 0) return i
    }
    return null
}

fun processList(ss: List<String?>) {
    for (i in ss) {
        if (i != null) {
            println(i)
        } else {
            return
        }
    }
}

private fun checkSize(size: Int, nameArg: String) {
    if (size <= 0) throw IllegalArgumentException("$nameArg должно быть положительным и больше нуля")
}

private fun lines(sizeW: Int, sizeH: Int,  horizontal: Boolean) {
    if (horizontal) {
        for (i in 1 until sizeH - 1) {
            var middleLine = "|"
            for (j in 1 until sizeW - 1) {
                middleLine += " "
            }
            middleLine += "|\n"
            print(middleLine)
        }
    }
    var line = "+"
    for (i in 1 until sizeW - 1) {
        line += "-"
    }
    line += "+\n"
    print(line)
}

fun drawRectangle(width: Int, height: Int) {
    checkSize(width, "width")
    checkSize(height, "height")

    lines(width, height,false)

    lines(width, height,true)

}