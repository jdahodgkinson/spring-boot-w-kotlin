fun main() {
    val colours = listOf("Red", "Green", "Blue")

    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    val numbers = mutableListOf<Int>()

    val months = mutableSetOf("Jan", "Feb")

    val webColours = mutableMapOf("red" to "ff0000", "blue" to "0000ff")

    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.set(3, -4)
    intArray[3] = -7
    intArray.forEach{println(it)}

    println(colours[2])

}
