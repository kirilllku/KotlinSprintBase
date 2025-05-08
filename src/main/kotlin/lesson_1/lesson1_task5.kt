package lesson_1

const val secondsPerMinute = 60
const val minutesPerHour = 60

fun main() {
    val seconds = 6480

    val hours = seconds / minutesPerHour / secondsPerMinute
    var remainigSeconds = seconds - hours * minutesPerHour * secondsPerMinute

    val minutes = remainigSeconds / minutesPerHour
    remainigSeconds = remainigSeconds - minutes * secondsPerMinute

    val Time = String.format("%02d:%02d:%02d", hours, minutes, remainigSeconds)
    println(Time)
}