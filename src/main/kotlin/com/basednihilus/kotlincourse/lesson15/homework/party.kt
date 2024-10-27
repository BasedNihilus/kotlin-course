package com.basednihilus.kotlincourse.lesson15.homework

class Party (
    val location: String,
    var attendees: Int
) {
    fun details() {
        println("Эта безумная пати будет проходить по адресу: $location, мы пригласили уже $attendees гостей")
    }
}