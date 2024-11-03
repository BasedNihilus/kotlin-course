package com.basednihilus.kotlincourse.lesson18.homework

import com.basednihilus.kotlincourse.lesson18.homework.animals.Animal
import com.basednihilus.kotlincourse.lesson18.homework.animals.Bird
import com.basednihilus.kotlincourse.lesson18.homework.animals.Cat
import com.basednihilus.kotlincourse.lesson18.homework.animals.Dog
import com.basednihilus.kotlincourse.lesson18.homework.printers.inkjetPrinter
import com.basednihilus.kotlincourse.lesson18.homework.printers.laserPrinter
import com.basednihilus.kotlincourse.lesson18.homework.shapes.Circle
import com.basednihilus.kotlincourse.lesson18.homework.shapes.Shape
import com.basednihilus.kotlincourse.lesson18.homework.shapes.Square
import com.basednihilus.kotlincourse.lesson18.homework.shapes.Triangle

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    val sounds = listOf("Bark", "Meow", "Tweet")
    for (i in animals.indices) {
        animals[i].makeSound(sounds[i])
    }

    val figures: List<Shape> = listOf(Square(11.0), Circle(10.0), Triangle(5.0, 3.0, 4.0))
    figures.forEach { figure ->
        println(figure.figureArea())
    }

    val text = ""
    println("ЛАЗЕРНЫЙ")
    val laserPrinter = laserPrinter()
    laserPrinter.print(text)
    println("СТРУЙНЫЙ")
    val inkjetPrinter = inkjetPrinter()
    inkjetPrinter.print(text)

    println("КОРЗИНА")
    val cart = ShoppingCart()
    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(3 to 2, 4 to 1))
    cart.addToCart(listOf(1, 2, 5, 6, 7, 8, 9, 10, 11))
    println(cart)
}