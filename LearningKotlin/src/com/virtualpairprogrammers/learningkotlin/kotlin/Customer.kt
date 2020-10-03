package com.virtualpairprogrammers.learningkotlin.kotlin

data class Customer(
    val name: String,
    val address: String,
    var age: Int
) {
    constructor(name: String, age: Int) : this(name, "", age)
}

class AlternativeCustomer(val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "") {

    var approved: Boolean = false
        set(value) {
            if (age >= 21) {
                field = value
            } else {
                println("Cannot approve customer under 21 years old.")
            }
        }

    val nextAge
        get() = age + 1

    fun upperCaseName(): String =
        name.toUpperCase()

    override fun toString(): String =
        "$name, $address, $age"

    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Micky", 22, "Some address")
    }

    operator fun component1() = name
    operator fun component2() = age

}

fun main() {
    val customer = AnotherAlternativeCustomer("Jack", 43, "High Street")
    customer.age = 19
    customer.approved = true
    val customer2 = AnotherAlternativeCustomer("John", 31)
    customer2.approved = true
    println("${customer} is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.name} is ${customer2.age} years old and is ${customer2.approved}")
    println("Next year ${customer.upperCaseName()} will be ${customer.nextAge}")

    val customer3 = AnotherAlternativeCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Sally", 29)
    println(customer4)
    val customer5 = customer4.copy(name="Diane")
    println(customer5)

    val (name, address, age) = customer5
}

