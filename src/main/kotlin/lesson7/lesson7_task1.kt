package lesson7

import kotlin.random.Random

fun main() {
    var password = ""
    val letters = "abcdefghijklmnopqrstuvwxyz"
    for (i in 0..5) {
        if (i % 2 != 0) {
            val randomNumber = Random.nextInt(0, 10)
            password += randomNumber
        } else {
            val randomChar = letters[Random.nextInt(letters.length)]
            password += randomChar
        }
    }
    println(password)
}