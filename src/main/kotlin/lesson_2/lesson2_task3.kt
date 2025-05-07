package lessons_2

fun main() {
    val hours = 9
    val minutes = 39
    val timeOfTravel = 457

    val timeOfArrival = timeOfTravel + hours * 60 + minutes
    val timeOfArrivalInHours = timeOfArrival / 60
    val timeOfArrivalInMinutes = timeOfArrival % 60

    println("%02d:%02d".format(timeOfArrivalInHours, timeOfArrivalInMinutes))
}