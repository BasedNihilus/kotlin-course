package com.basednihilus.kotlincourse.lesson13

fun main() {

    val numbersList = listOf(1, 3, -8, 0, 33, 100500, 69, 42, -1000, 18, 1, 30, 25, 1, 21)
    val numbersList1 = listOf<Int>()
    val textList = listOf("один", "два", "три", "четыре", "пять")


    println(numbersList.getOrElse(5) { "В списке меньше пяти или 5 элементов" })

    println(numbersList.isEmpty())
    println(numbersList1.isEmpty())

    println(numbersList.isNotEmpty())

    println(numbersList.getOrElse(10) { 100001 })

    println(numbersList.joinToString(separator = ", "))

    println(numbersList.sum())

    println(numbersList.average())

    println(numbersList.maxOrNull())

    println(numbersList.minOrNull())

    println(numbersList.firstOrNull { it == numbersList[0] })
    println(numbersList.getOrElse(0) { null })

    println(numbersList.contains(100500))


    println(numbersList.filter { it in 18..30 })

    println(numbersList.filter { it % 3 == 0 && it % 2 == 0 })

    val numbersListNull = listOf(1, 3, -8, 0, 33, 100500, 69, null, 42, -1000, 18, 30, null, 25, 21)
    println(numbersListNull.filterNotNull())


    println(textList.map { it.length.toInt() })

    println(textList.associate { it to it.reversed() })

    println(textList.sorted())


    println(textList.sortedDescending())

    println(numbersList.map { it * it })

    println(textList.groupBy { it.first() })

    println(numbersList.distinct())

    println(numbersList.take(3))

    println(numbersList.takeLast(3))


    println("-----Задание 3 ------")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(
        grades.filter { it >= 60 }
            .sorted()
            .take(3)
    )

    println("-----Задание 4 ------")
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
        "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
        "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")

    println(list.map { it.lowercase() }
        .groupBy { it[0] }
    )

    println("-----Задание 5 ------")
    println("Средняя длина: %.2f".format((list.map { it.length }).average()))

    println("-----Задание 6 ------")
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(((numbers.distinct()).sortedDescending()).groupBy { if (it % 2 == 0) "четные" else "нечетные" })

    println("-----Задание 7 ------")
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(ages.filterNotNull().firstOrNull{ it > 18 }?.toString() ?: "Подходящий возраст не найден")

}