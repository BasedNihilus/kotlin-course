package com.basednihilus.kotlincourse.lesson6

fun main() {
}

fun yearSeason(monthNumber: Int) {
    if (monthNumber <= 2 && monthNumber >= 1 || monthNumber == 12)
    {
        println("Winter")
    }
    else if (monthNumber >= 3 && monthNumber <= 5)
    {
        println("Spring")
    }
    else if (monthNumber > 5 && monthNumber < 9)
    {
        println("Summer")
    }
    else if (monthNumber > 8 && monthNumber < 12)
    {
        println("Autumn")
    }
    else
    {
        println ("Error")
    }
}

fun dogsHumanAge(dogsAge: Int) {
    if (dogsAge <= 2 && dogsAge >= 1)
    {
        println(dogsAge * 10.5)
    } else if (dogsAge <= 2 && dogsAge >= 1 || dogsAge >= 3)
    {
        println((2 * 10.5) + (dogsAge - 2) * 4)
    }
}

fun transportType(routeLength: Int) {
    if (routeLength <= 1 && routeLength > 0)
    {
        println("onFoot")
    } else if (routeLength <= 5 && routeLength >= 2)
    {
        println("bike")
    }
    else if (routeLength > 5)
    {
        println("car")
    } else
    {
        println("Error")
    }
}

fun bonusPoints(paidCash: Int) {
    if (paidCash <= 1000 && paidCash >= 100)
    {
        println(paidCash * 2 / 100)
    } else if (paidCash >= 5000)
    {
        println(paidCash * 5 / 100)
    } else
    {
        println("Error")
    }
}

fun documentStorageSystem(fileExtension: String) {
    if (fileExtension == ".txt")
    {
        println("text")
    } else if (fileExtension == ".jpeg")
    {
        println("picture")
    } else if (fileExtension == ".xlsx")
    {
        println("table")
    } else
    {
        println("unknown type")
    }
}

fun temperatureConversion(temperatureForConv: Int, measureSystem: String): String {
    var totalResult: String
    if (measureSystem == "C")
    {
        totalResult = (temperatureForConv * 1.8 + 32).toString()
    } else if (measureSystem == "F")
    {
        totalResult = ((temperatureForConv - 32) / 1.8).toString()
    } else
    {
        totalResult = "Error"
    }
    return totalResult
}

fun clothesType(temperature: Int) {
    if (temperature <= -1 && temperature >= -29)
    {
        println("jacket and hat")
    } else if (temperature >= 0 && temperature <= 15)
    {
        println("windbreaker")
    } else if (temperature >= 16 && temperature <= 34)
    {
        println("t-shirt and shorts")
    } else if (temperature <= -30 || temperature >= 35)
    {
        println("stay at home")
    }
}

fun cinemaAgeCategory(guestAge: Int) {
    if (guestAge <= 12 && guestAge > 0)
    {
        println("for kids")
    } else if (guestAge <=17 && guestAge > 12)
    {
        println("for teens")
    } else if (guestAge >= 18)
    {
        println("18+")
    } else
    {
        println ("Error")
    }
}