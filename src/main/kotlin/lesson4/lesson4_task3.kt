package lesson4

const val SUN_ON: Boolean = true
const val AWNING_IS_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "не зима"

fun main() {
    val sun = true
    val awningIsOpen = true
    val airHumidity = 20
    val timeOfYear = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${sun == SUN_ON && awningIsOpen == AWNING_IS_OPEN && airHumidity == AIR_HUMIDITY && timeOfYear == TIME_OF_YEAR}"
    )
}

