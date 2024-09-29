package com.basednihilus.kotlincourse.lesson8

fun main(){
}

fun convert(phrase: String): String{
    return when{
        phrase.contains("невозможно", true) -> phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
        phrase.startsWith("Я не уверен", true) -> "${phrase.trim('.')}, но моя интуиция говорит об обратном."
        phrase.contains("катастрофа", true) -> phrase.replace("катастрофа", "интересное событие")
        phrase.endsWith("без проблем.",true) -> phrase.replace("без проблем", "с парой интересных вызовов по пути")
        !phrase.contains(" ") -> "Иногда, ${phrase.lowercase()}, но не всегда"
        else -> ""
    }
}

fun dateTime(login: String) {
    val t = login.split(" ")
    return println("${t[5]}\n${t[6]}")
}

fun creditCard(number: String) {
    val splitNumber = number.split(" ")
    return println("**** **** **** ${splitNumber[3]}")
}

fun emailFormat(email: String) {
    val newEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
    return println(newEmail)
}

fun filePath(path: String){
    val splitPath = path.split("/")
    return println(splitPath.last())
}

fun abbreviation(phrase1: String): String {
    val abbrList = phrase1.split(' ', '-')
    var abbrPhrase = ""
    for (j in abbrList.indices) { //for (i in 0 until abbrList.length)
        abbrPhrase += (abbrList[j][0].uppercase())
    }
    return abbrPhrase
}