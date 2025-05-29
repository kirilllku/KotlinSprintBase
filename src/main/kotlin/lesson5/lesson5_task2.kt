package lesson5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {
    print("Введите год рождения: ")
    val userAge = CURRENT_YEAR - readln().toInt()

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}
