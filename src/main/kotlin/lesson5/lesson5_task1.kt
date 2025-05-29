package lesson5

fun main() {
    val num1 = 8
    val num2 = 3

    println("Введите ответ для слудуещего действия:")
    print("$num1 + $num2 = ")
    val solution = readln().toInt()

    val captchaAnswer = if (solution == num1 + num2) "Добро пожаловать!"
    else "Доступ запрещен."

    println(captchaAnswer)
}
