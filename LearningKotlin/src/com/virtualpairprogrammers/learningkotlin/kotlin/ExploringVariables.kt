package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val myDouble = 21.4

//    println("Is myDouble a Double? ${myDouble is Double}")
//    println("myDouble is a ${myDouble::class.qualifiedName}")
//
//    println("myDouble's javaClass is ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
//    println("myInteger is a ${myInteger::class.qualifiedName}")

    val myFloat: Float = 13.6f
    val result = myFloat + myInteger
//    print(result)

    val bd = BigDecimal(17)

    val bd2: BigDecimal

//    println("Hello")

    bd2 = bd.add(BigDecimal(13))




    var name = "Jack"
    val surname = "Hodgkinson"

    name = "Jack David Andrew"
//
//    println("Hello $name ${surname.toUpperCase()}")
//    println("Your first name has ${name.length} characters.")
//
    val story = """It was a dark and stormy night.
        |A foul smell crept across the city.
        |Jane wondered what time it was and when it would be daylight.""".trimMargin("|")

//    println(story)
//
    val changedStory = story.replaceAfterLast("it ", "would be dawn.")
//    println(changedStory)
}