package com.basednihilus.kotlincourse.lesson19

fun main(){
    val child = ChildrenClass("значение приватного", "значение защищенного")

    child.publicField = "Антонио Бандерас"
    child.updateProtectedField("Хулио Иглесиас")
    child.setPrivateField("Урмас Отт")

    println(child.getAll())

    child.printText()
}