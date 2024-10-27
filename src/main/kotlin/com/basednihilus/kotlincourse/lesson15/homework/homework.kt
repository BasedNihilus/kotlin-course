package com.basednihilus.kotlincourse.lesson15.homework

fun main() {

    println("PARTY")
    val party1 = Party("улица Пушкина, дом Колотушкина", 50)
    party1.details()

    println("EMOTION")
    val emotion1 = Emotion("счастье", 5)
    emotion1.express()

    println("MOON")
    Moon.showPhase()
    Moon.isVisible = true
    Moon.showPhase()

    println("PRODUCT")
    val defaultProduct = Product()
    println(defaultProduct)
    val customProduct = Product(name = "Молоко", price = 100.0, quantity = 50)
    println(customProduct)

    println("CONCERT")
    val concert1 = Concert("Сортирный союз", "дом Колотушкина, улица Пушкина", 2.50, 20)
    concert1.info()
    concert1.buyTicket()
    concert1.info()
    concert1.buyTicket()



}