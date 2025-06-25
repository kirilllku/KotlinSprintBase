package lesson6

import kotlin.random.Random

fun main() {

    println("Для успешной авторизации докажите, что вы не бот.\nВведите решение следуещего выражения:")
    var attempts = 0
    val maxAttempts = 3

    while (attempts < maxAttempts) {
        val number1 = Random.nextInt(1, 10)
        val number2 = Random.nextInt(1, 10)
        val answer = number1 + number2

        print("$number1 + $number2 = ")
        val userAnswer = readln().toInt()

        if (userAnswer == answer) {
            println("Добро пожаловать!")
            break
        } else attempts++

        if (attempts == maxAttempts) println("Доступ запрещен")
    }
}