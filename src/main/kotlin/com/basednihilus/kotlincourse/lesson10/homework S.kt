package com.basednihilus.kotlincourse.lesson10

fun main() {

    println("----задача 1----")
    val set1 = setOf<Int>()
    println(set1)


    println("----задача 2----")
    val set2 = setOf(1, 2, 3)
    println(set2)


    println("----задача 3----")
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
    println(set3)


    println("----задача 4----")
    val set4 = mutableSetOf("Kotlin", "Java", "Scala")
    set4.add("Swift")
    set4.add("Go")
    println(set4)


    println("----задача 5----")
    val set5 = mutableSetOf(1, 2, 3, 4, 5, 6)
    set5.remove(2)
    println(set5)


    println("----задача 6----")
    val set6 = setOf(1, 2, 3, 4, 5, 6)
    for (i in set6){
        println(i)
    }


    println("----задача 7----")
    val set7 = setOf("один", "два", "три", "четыре", "пять")
    val searchString = "три"
    println(search(set7, searchString))


    println("----задача 8----")
    val set8 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val secondSet8 = setOf("два","четыре","шесть", "восемь", "стопицот", "дофигища")
    val unitedSet8 = mutableSetOf<String>()
    for (i in set8){
        unitedSet8.add(i)
    }
    for (i in secondSet8){
        unitedSet8.add(i)
    }
    println(unitedSet8)


    println("----задача 9----")
    val set9 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val secondSet9 = setOf(5, 12, 14, 4, 22, 7, 15, 33, 45, 2)
    val commonSet9 = mutableSetOf<Int>()
    for(i in set9) {
        if (secondSet9.contains(i)){
            commonSet9.add(i)
        }
    }
    println(commonSet9)

    println("----задача 9 вариант 2----")
    for (i in set9) {
        for (j in secondSet9) {
            if (i == j) {
                commonSet9.add(i)
            }
        }
    }
    println(commonSet9)


    println("----задача 10----")
    val set10 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val secondSet10 = setOf("два","четыре","шесть", "восемь", "стопицот", "дофигища")
    val differenceSet10 = mutableSetOf<String>()
    for (i in set10){
        var inSecondSet = false
        for (j in secondSet10){
            if(i == j) {
                inSecondSet = true
            }
        }
        if (!inSecondSet){
            differenceSet10.add(i)
        }
    }
    println(differenceSet10)


    println("----задача 11----")
    val set11 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val list11 = mutableListOf<String>()
    for (i in set11){
        list11.add(i)
    }
    println(list11)
}

fun search(set7: Set<String>, searchString: String ): Boolean{
    for (i in set7) {
        if (i == searchString) {
            return true
        }
    }
    return false
}