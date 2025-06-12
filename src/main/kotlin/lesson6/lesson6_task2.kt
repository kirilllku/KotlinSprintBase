package lesson6

fun main() {
    print("Введите количество секунд: ")
    val secondsAtTheBegining = readln().toInt()
    var seconds = secondsAtTheBegining

    while (seconds > 0) {
        seconds--
        Thread.sleep(1000)
    }
    println("Прошло $secondsAtTheBegining секунд")
}