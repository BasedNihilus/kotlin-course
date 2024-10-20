package com.basednihilus.kotlincourse.lesson14

fun main(){

    val averTest = mapOf<String, Double>()
    val average = if (averTest.isNotEmpty()) {
        averTest.values.sum() / averTest.size
    } else {
        0.0
    }
    println(average)


    val autoTest = mapOf<String, String>()
    println(autoTest.map { it.key })


    val autoTest1 = mutableMapOf<String, String>()
    autoTest1["Login"] = "Passed"
    println( autoTest1.count { it.value == "Passed" } )


    val bugTrack = mutableMapOf<Int, String>()  // Int, так как ключ это Bug ID
    bugTrack.remove(1234)


    val webTests = mapOf<String, Int>()
    webTests.forEach { _ ->
        println("${webTests.keys} - ${webTests.values}") }


    val responseTime = mapOf<String, Long>()
    val threshold = 1000
    println(responseTime.filterValues { it > threshold })


    val testApi = mapOf<String, String>()
    println(testApi.getOrDefault("endpoint") { println("Не тестировался")})


    val testConf = mapOf<String, String >()
    println(testConf.getOrElse("browserType") { println("Default Browser")})


    val version = mapOf<String, String>()
    val versionMutable = version.toMutableMap()

    val testSet = mapOf<String, List<String>>()
    val defaultSet = ("default, default, default")
    println(testSet.getOrDefault("Nokia 3110", defaultSet))


    val errorMap = mapOf<Int, String>()
    println(errorMap.containsKey(404))


    val testScripts = mapOf<String, String>()
    val testScriptsFiltered = testScripts.filterValues { it == "Passed" }

    val testModules = mapOf<String, String>()
    println(testModules.all { it.value == "Failed" })


    val setupTests = mutableMapOf<String, String>()
    setupTests.putAll(testConf)

    val bug1 = mapOf<Int, String>()
    val bug2 = mapOf<Int, String>()
    val addBugs = bug1 + bug2

    val tempDate = mutableMapOf<Int, String>()
    val filteredTempDate = tempDate.filterValues { it == "skipped" }
    tempDate.clear()
    tempDate.putAll(filteredTempDate)


    val testConf1 = mutableMapOf<Int, String>()
    testConf1.values.remove("outdated" )
    val testReport = testConf1.map { "Test ID: ${it.key} результат: ${it.value}" }


    val testResult2 = mutableMapOf(1 to 120, 2 to 100, 3 to 14, 4 to 88, 5 to 666)
    val archTestResult2: Map<String, Int> = testResult2.mapKeys { (id, _) -> getNameById(id) }.toMap()
    println(archTestResult2)

    val perfAss = mutableMapOf<String, Int>()
    perfAss.mapValues { it.value * 1.10 }


    val compError = mapOf<Int, String>()
    compError.isEmpty()

    val loadTest = mapOf<Int, String>()
    loadTest.isNotEmpty()

    val autoTests = mapOf<Int, String>()
    autoTests.all { it.value == "Passed" }

    autoTests.any { it.value == "Failed"}

    val testResult3 = mapOf<String, String>()
    testResult3.filter { it.key.contains("optional") && it.value == "Failed" }

}

fun getNameById(id: Int): String {
    return "Test $id"
}