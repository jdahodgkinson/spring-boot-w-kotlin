package com.virtualprogrammers.application

import com.virtualprogrammers.utilities.toSentenceCase

fun applySomeFunctionToAString(inputString: String, myFunction: (String) -> String): String =
    myFunction(inputString)

fun main() {
    val result = applySomeFunctionToAString("hello", ::toSentenceCase)
    val result2 = applySomeFunctionToAString("hello"){ it.toUpperCase() }
    println(result)
    println(result2)

    val colours = listOf("red", "green", "blue", "black")

    val upperCaseColours = colours.map {it.toUpperCase()}

    upperCaseColours.forEach { println(it) }

    val coloursStartingWithB = colours.filter { it.startsWith('b') }
    coloursStartingWithB.forEach { println(it) }

    colours.flatMap { if (it.startsWith('b')) listOf(it, it) else listOf(it) }.forEach { println(it) }

    println(colours.reduce {result, value -> "$result, $value" })

    val numbers = colours.map { it.length }
    numbers.forEach { println(it) }

    println(numbers.fold (0) {result, value -> if (value < result) result else value})

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap.filter { (k, v) -> v.startsWith("t") }.forEach { (k, v) -> println("$k $v") }

}