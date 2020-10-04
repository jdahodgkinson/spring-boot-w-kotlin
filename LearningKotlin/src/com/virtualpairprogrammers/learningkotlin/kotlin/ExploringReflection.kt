package com.virtualpairprogrammers.learningkotlin.kotlin

import java.lang.Math.sqrt
import kotlin.math.roundToInt
import kotlin.reflect.full.declaredFunctions

fun isPrime(a: Int): Boolean {
    val maxNumberToCheck = sqrt(a.toDouble()).roundToInt()
    for (i in 2..maxNumberToCheck) if (a % i == 0) return false
    return true
}


fun main() {

    val myList = 14..20
    val primeList = myList.filter (::isPrime)
    println(primeList)

    val functions = myList::class.declaredFunctions
    println(functions)
}