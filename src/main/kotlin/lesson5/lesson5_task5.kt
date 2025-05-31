package lesson5

import kotlin.random.Random
import java.util.Scanner

fun main() {

    val randomNumbers = mutableListOf<Int>()
    for (i in 1..3) {
        val randomNumber = Random.nextInt(0, 43)
        randomNumbers.add(randomNumber)
    }

    println("Угадайте три числа от 0 до 42")
    val userNumbers = mutableListOf<Int>()
    val scanner = Scanner(System.`in`)
    for (i in 1..3) {
        print("Введите число $i: ")
        val number = scanner.nextLine().toInt()
        userNumbers.add(number)
    }

    val intersection = userNumbers.intersect(randomNumbers)
    val numberofIntersection = intersection.size

    val resultText = when(numberofIntersection) {
        3 -> "Джекпот!!!!!!!!!!!!!!\nВы угадали все 3 чила"
        2 -> "Вы получаете Крупный приз!!!\nВы угадали 2 чила"
        1 -> "Вы получаете утешительный приз!\nВы угадали 1 чило"
        else -> "Вы не угадали ни одного числа"
    }

    println(resultText)

    randomNumbers.sort()
    println("Победные числа: ${randomNumbers.joinToString()}")
}


