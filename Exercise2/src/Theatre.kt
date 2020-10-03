import java.math.BigDecimal

data class Seat(val row: Int, val num: Int, val price: BigDecimal, val description: String) {
    //YOU MAY NOT EDIT THIS CLASS!
    override fun toString(): String = "Seat $row-$num $$price ($description)"
}

class Theater {

    // SEAT PRICES:
    // Seats in rows 14 and 15 cost 14.50
    // Seats in rows 1 to 13 and numbered 1 to 3 or 34 to 36 cost 16.50
    // All other seats in row 1 cost 21.00
    // All other seats cost 18.00

    // SEAT DESCRIPTIONS:
    // Seats in row 15: "Back row"
    // Seats in row 14: "Cheaper seat"
    // All other rows, seats 1 to 3 and 34 to 36: "Restricted View"
    // All other seats in rows 1 and 2 "Best view"
    // All other seats: "Standard seat"

    private val mutableSeats = mutableListOf<Seat>()

    init {
        val seatPrices = mapOf(
            "Best view" to BigDecimal(21),
            "Standard seat" to BigDecimal(18),
            "Restricted view" to BigDecimal(16.50),
            "Cheaper seat" to BigDecimal(14.50),
            "Back row" to BigDecimal(14.50)
        )

        for (row in 1..15) {
            for (num in 1..36) {
                val description = when {
                    row == 15 -> "Back row"
                    row == 14 -> "Cheaper seat"
                    num <= 3 || num >= 34 -> "Restricted view"
                    row <= 2 -> "Best view"
                    else -> "Standard seat"
                }
                val price = seatPrices[description]
                mutableSeats.add(Seat(row, num, price!!, description))
            }
        }
    }

    val seats
        get() = mutableSeats.toList()

}

fun main(args: Array<String>) {
    val cheapSeats = Theater().seats.filter { it.price == BigDecimal(14.50) }
    for (seat in cheapSeats) println(seat)
}