package lesson6

import kotlin.random.Random

fun main() {
    var attemptCounter = 5
    val number = Random.nextInt(1, 10)

    do {
        print("Введите число от 1 до 9: ")
        val userNumber = readln().toInt()

        if (userNumber == number) {
            println("Это была великолепная игра!")
        } else {
            println("Неверно. Осталось попыток: ${attemptCounter--}")
        }
    } while (attemptCounter > 0 && userNumber != number)

    println("Было загадано число $number")
}