package com.basednihilus.kotlincourse.lesson19

class SlotMachine(
    val color: String,
    val model: String,
    private var isOn: Boolean = false,
    private var isOSLoaded: Boolean = false,
    private val availableGames: List<String>,
    val hasJoystick: Boolean,
    private var balance: Double = 0.0,
    val owner: String,
    val supportPhone: String
) {

    fun powerOn() {
        isOn = true
    }

    fun powerOff() {
        isOn = false
    }

    private fun loadOS() {

    }

    private fun shutdownOS() {

    }

    fun showGames(): List<String> {
        return availableGames
    }

    fun startGame(gameName: String): Boolean {
        return availableGames.contains(gameName)
    }

    fun payForSession(amount: Double) {
        balance += amount
    }

    private fun openSafeAndDispenseCash(amount: Double): Boolean {
        return if (balance >= amount) {
            balance -= amount
            true
        } else {
            false
        }
    }

    private fun payoutWinnings(amount: Double): Boolean {
        return openSafeAndDispenseCash(amount)
    }
}