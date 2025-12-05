package lesson_12

class Weather {
    var dayTemperature = 10.0
    var nightTemperature = -10.0
    var rain = false

    fun printWeather() {
        println("Температура днём:  $dayTemperature°C")
        println("Температура ночью: ${nightTemperature}°C")
        println("Осадки:            ${if (rain) "Да" else "Нет"}")
        println()
    }
}

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()

    weather1.dayTemperature = 15.0
    weather1.nightTemperature = 9.0
    weather1.rain = true

    weather2.dayTemperature = 7.0
    weather2.nightTemperature = 2.0
    weather2.rain = true

    println("Погода сегодня:")
    weather1.printWeather()
    println("Погода вчера:")
    weather2.printWeather()
}