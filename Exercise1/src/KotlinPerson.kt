import java.util.*

data class KotlinPerson(
    val id: Long,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: Calendar?
) {

    var favouriteColour: String? = null

    fun getLastLetter(a: String): String = a.takeLast(1)

    fun getUpperCaseColour(): String {
        return favouriteColour?.toUpperCase() ?: ""
    }

    fun getLastLetterOfColour(): String {
        return favouriteColour?.let{getLastLetter(it)} ?: ""
    }

    fun getColourType(): String {
        return when (getUpperCaseColour()) {
            "" -> "empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }
    }


    override fun toString(): String {
        return "$title $firstName $surname"
    }

    val age: Int?
        get() = getAge(dateOfBirth)

    val safeAge: Int
        get() = age ?: -1

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth == null) return null
            val today: Calendar = GregorianCalendar()
            val years: Int = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }
}

fun main() {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3))
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", dateOfBirth = null)
    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988, 5, 3))}")
    val olderPerson = if (john.safeAge > jane.safeAge) john else jane
    println("The older person was $olderPerson")
}