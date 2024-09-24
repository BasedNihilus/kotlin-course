package com.basednihilus.kotlincourse.lesson6

fun main() {
    println(yearSeason (10))
    dogsHumanAge (25)
    transportType (5)
    println(bonusPoints (6000))
    println(documentStorageSystem (".jpeg"))
    println(temperatureConversion (30, "F"))
    clothesType(20)
    println(cinemaAgeCategory(10))

}

fun yearSeason(monthNumber: Int): String {
    var totalYearSeason: String
    if (monthNumber <= 2 && monthNumber >= 1 || monthNumber == 12)
    {
        totalYearSeason = "Winter"
    }
    else if (monthNumber >= 3 && monthNumber <= 5)
    {
        totalYearSeason = "Spring"
    }
    else if (monthNumber > 5 && monthNumber < 9)
    {
        totalYearSeason = "Summer"
    }
    else if (monthNumber > 8 && monthNumber < 12)
    {
        totalYearSeason = "Autumn"
    }
    else
    {
        totalYearSeason = "Error"
    }
    return totalYearSeason
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

fun bonusPoints(paidCash: Int): String {
    var totalBonusPoints: String
    if (paidCash <= 1000 && paidCash >= 100)
    {
        totalBonusPoints = (paidCash * 2 / 100).toString()
    } else if (paidCash >= 5000)
    {
        totalBonusPoints = (paidCash * 5 / 100).toString()
    } else
    {
        totalBonusPoints = "Error"
    }
    return totalBonusPoints
}

fun documentStorageSystem(fileExtension: String): String {
    var totalDocumentType: String
    if (fileExtension == ".txt")
    {
        totalDocumentType = "text"
    } else if (fileExtension == ".jpeg")
    {
        totalDocumentType = "picture"
    } else if (fileExtension == ".xlsx")
    {
        totalDocumentType = "table"
    } else
    {
        totalDocumentType = "unknown type"
    }
    return totalDocumentType
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

fun cinemaAgeCategory(guestAge: Int): String {
    var TotalAgeCategory: String
    if (guestAge <= 12 && guestAge > 0)
    {
        TotalAgeCategory = "for kids"
    } else if (guestAge <=17 && guestAge > 12)
    {
        TotalAgeCategory = "for teens"
    } else if (guestAge >= 18)
    {
        TotalAgeCategory = "18+"
    } else
    {
        TotalAgeCategory = "Error"
    }
    return TotalAgeCategory
}