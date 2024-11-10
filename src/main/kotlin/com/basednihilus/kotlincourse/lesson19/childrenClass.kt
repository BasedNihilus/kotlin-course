package com.basednihilus.kotlincourse.lesson19

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,

) : BaseClass(privateVal, protectedVal, privateVal) {

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun updateProtectedField(value: String) {
        protectedField = value
    }

}