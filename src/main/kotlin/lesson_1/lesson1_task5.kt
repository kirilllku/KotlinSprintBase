package lesson_1

fun main() {

    val seconds = 6480

    val hours = seconds / 60 / 60
    var remainigSeconds = seconds - hours * 60 * 60

    val minutes = remainigSeconds / 60
    remainigSeconds = remainigSeconds - minutes * 60

    val Time = String.format("%02d:%02d:%02d", hours, minutes, remainigSeconds)
    println(Time)



}