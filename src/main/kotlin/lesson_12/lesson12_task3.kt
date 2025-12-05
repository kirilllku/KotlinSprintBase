package lesson_12

class Weather3(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _rain: Boolean
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var rain = _rain

    fun conversionFromKelvinToCelsius(temperature: Int): Double {
        return (temperature.toDouble() - 273.15)
    }

    fun printWeather() {
        println("Температура днём:  %.2f°C".format(this.conversionFromKelvinToCelsius(dayTemperature)))
        println("Температура ночью: %.2f°C".format(this.conversionFromKelvinToCelsius(nightTemperature)))
        println("Осадки:            ${if (rain) "Да" else "Нет"}")
        println()
    }
}

fun main() {
    val weather1 = Weather3(
        290,
        280,
        true
    )
    val weather2 = Weather3(
        300,
        295,
        false
    )

    println("Погода сегодня:")
    weather1.printWeather()
    println("Погода вчера:")
    weather2.printWeather()
}