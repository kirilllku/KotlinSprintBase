package lesson7

import kotlin.random.Random

fun main() {
    while (true) {
        val smsCode = Random.nextInt(1000, 10000)
        print("Ваш код авторизации: $smsCode\nВведите код из смс: ")
        val userInput = readln().toInt()

        if (userInput != smsCode) {
            continue
        } else {
            println("Добро пожаловать!")
            break
        }
    }
}