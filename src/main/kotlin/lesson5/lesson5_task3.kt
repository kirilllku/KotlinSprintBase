package lesson5

const val FIRST_NUMBER = 13
const val SECOND_NUMBER = 27

fun main() {
    println("Угадайте два числа от 0 до 42.")
    print("Введите первое число: ")
    val num1 = readln().toInt()
    print("Введите второе число: ")
    val num2 = readln().toInt()
    println("\nПобедные числа $FIRST_NUMBER и $SECOND_NUMBER")

    val resultText =
        if ((num1 == FIRST_NUMBER && num2 == SECOND_NUMBER) || (num1 == SECOND_NUMBER && num2 == FIRST_NUMBER)) {
            "Поздравляем! Вы выиграли главный приз!"
        } else if (num1 == FIRST_NUMBER || num1 == SECOND_NUMBER || num2 == FIRST_NUMBER || num2 == SECOND_NUMBER) {
            "Вы выиграли утешительный приз!"
        } else {
            "Неудача!"
        }
    println(resultText)
}
