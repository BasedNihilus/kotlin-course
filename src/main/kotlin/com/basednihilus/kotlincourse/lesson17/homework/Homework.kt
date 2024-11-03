package com.basednihilus.kotlincourse.lesson17.homework

fun main(){
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )
    println("----на дно-------")
    val bottomContainer = MaterialsBottom()
    ordinalNumbers.forEach { bottomContainer.addMaterial(it) }
    bottomContainer.addToBottom("new какое-то что-то")
    bottomContainer.printContainer()

    println("ЧЕРЕЗ СТРОЧКУ")
    val newList = listOf(
        "первый", "второй", "третий", "четвертый", "пятый",
        "шестой", "седьмой", "восьмой", "девятый", "десятый",
        "одиннадцатый", "двенадцатый", "тринадцатый", "четырнадцатый", "пятнадцатый",
        "шестнадцатый", "семнадцатый", "восемнадцатый", "девятнадцатый", "двадцатый"
    )

    val throughTheLineContainer = ThroughTheLine()
    ordinalNumbers.forEach { throughTheLineContainer.addMaterial(it) }
    throughTheLineContainer.alternation(newList)
    throughTheLineContainer.printContainer()

    println("АЛФАВИТ")
    val alphabetContainer = Alphabetical()
    ordinalNumbers.forEach { alphabetContainer.addMaterial(it) }
    alphabetContainer.addAlphabetically("new какое-то что-то")
    alphabetContainer.printContainer()

    println("КЛЮЧИ И ЗНАЧЕНИЯ")
    val pairs = mapOf("key1" to "value1", "key2" to "value2")
    val keyValueContainer = KeyValue()
    ordinalNumbers.forEach { keyValueContainer.addMaterial(it) }
    keyValueContainer.addKeyValuePairs(pairs)
    keyValueContainer.printContainer()
}