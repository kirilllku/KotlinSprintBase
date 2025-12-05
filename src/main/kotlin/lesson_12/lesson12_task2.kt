package lesson_12

class Weather2(
    var dayTemperature: Double,
    var nightTemperature: Double,
    var rain: Boolean
) {
    fun printWeather() {
        println("Температура днём:  $dayTemperature°C")
        println("Температура ночью: ${nightTemperature}°C")
        println("Осадки:            ${if (rain) "Да" else "Нет"}")
        println()
    }
}

fun main() {
    val weather1 = Weather2(
        15.0,
        9.0,
        true
    )
    val weather2 = Weather2(
        7.0,
        2.0,
        false
    )

    println("Погода сегодня:")
    weather1.printWeather()
    println("Погода вчера:")
    weather2.printWeather()
}