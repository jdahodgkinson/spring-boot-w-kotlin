package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.random.Random

fun main() {
    var result: Any
    val randomNumber = Random.nextInt(2)

    result = if (randomNumber == 1) {
        BigDecimal(30)
    } else {
        "Hello"
    }

    println("Result is currently $result")

    result = if (result is BigDecimal) {
        result.add(BigDecimal(47))
    } else {
        val tempResult = result as String
        tempResult.toUpperCase()
    }

    println("Result is currently $result")


}