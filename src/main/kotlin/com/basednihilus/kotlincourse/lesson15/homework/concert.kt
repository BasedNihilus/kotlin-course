package com.basednihilus.kotlincourse.lesson15.homework

class Concert(
    val band: String,
    val location: String,
    val ticketPrice: Double,
    val capacity: Int,
) {
    private var soldTickets: Int = 0
    fun info(){
        println("Новый концерт группы '$band' пройдет по адресу: $location. Цена одного билета - $ticketPrice . Вместимость " +
                "помещения $capacity. Мы уже продали $soldTickets билетов")
    }

    fun buyTicket() {
        if(soldTickets < capacity ) {
            soldTickets++
        } else {
            println("Мест больше нет!")
        }
    }
}