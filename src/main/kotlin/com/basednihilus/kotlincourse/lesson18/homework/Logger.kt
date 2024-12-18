package com.basednihilus.kotlincourse.lesson18.homework

class Logger () {

    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> printColored("$level: $message", Colors.YELLOW)
            "ERROR" -> printColored("$level: $message", Colors.WHITE, Background.RED)
            "DEBUG" -> printColored("$level: $message", Colors.CYAN)
            else -> println("INFO: $message")
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Error")
    }
}