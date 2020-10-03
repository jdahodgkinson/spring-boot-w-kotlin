package com.virtualpairprogrammers.learningkotlin.kotlin

import java.io.FileInputStream
import java.lang.ArithmeticException

@Throws (InterruptedException::class)
fun divide(a: Int, b: Int): Double {
    Thread.sleep(1000)
    return (a.toDouble() / b)
}

fun printFile() {
    val input = FileInputStream("file.txt")
    input.use {
        // an exception is thrown here.
    }
}

fun main() {
    var result = try {
        divide(5, 23)
    }
    catch (e: Exception) {
        0
    }
    println(result)
}