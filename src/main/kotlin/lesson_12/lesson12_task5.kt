package lesson_12

import kotlin.math.roundToInt
import kotlin.random.Random
import java.util.Locale

val dayTemperatureRange = 20.0..25.0
val nightTemperatureRange = 10.0..15.0

class Weather5(
    _dayTemperature: Double,
    _nightTemperature: Double,
    _rain: Boolean
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var rain = _rain

    fun printWeather() {
        println("Температура днём:  $dayTemperature°C")
        println("Температура ночью: ${nightTemperature}°C")
        println("Осадки:            ${if (rain) "Да" else "Нет"}")
        //println()
    }

    init{
        println("=============================")
        printWeather()
        println("=============================")
        println()
    }
}

fun randomTemperature(range: ClosedFloatingPointRange<Double>): Double {
    val randomTemperature = Random.nextDouble(range.start, range.endInclusive)
    val rounding = (randomTemperature * 100).roundToInt() / 100.0
    return rounding
}

fun main() {
    val listOfWeather = List<Weather5>(30) {
        Weather5(
            _dayTemperature = randomTemperature(dayTemperatureRange),
            _nightTemperature = randomTemperature(nightTemperatureRange),
            _rain = Random.nextBoolean()
        )
    }

    val averageDayTemperature = listOfWeather
        .map { it.dayTemperature }
        .average()
    val averageNightTemperature = listOfWeather
        .map { it.nightTemperature }
        .average()
    val daysWithRain = listOfWeather.count { it.rain == true}

    println("Средняя дненая температура: %.2f".format(Locale.US, averageDayTemperature))
    println("Средняя ночная температура: %.2f".format(Locale.US, averageNightTemperature))
    println("Дней с дождем: $daysWithRain")


}