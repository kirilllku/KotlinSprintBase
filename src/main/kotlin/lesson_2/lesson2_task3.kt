package lessons_2

const val MINUTES_PER_HOUR = 60

fun main() {
    val hours = 9
    val minutes = 39
    val timeOfTravel = 457

    val timeOfArrival = timeOfTravel + hours * MINUTES_PER_HOUR + minutes
    val timeOfArrivalInHours = timeOfArrival / MINUTES_PER_HOUR
    val timeOfArrivalInMinutes = timeOfArrival % MINUTES_PER_HOUR

    println("%02d:%02d".format(timeOfArrivalInHours, timeOfArrivalInMinutes))
}