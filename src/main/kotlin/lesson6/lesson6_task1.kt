package lesson6

fun main() {
    println("Создание нового пользователя")
    print("Логин: ")
    val login = readln().toString()
    print("Пароль: ")
    val password = readln().toString()

    println("Для авторизации введите логин и пароль")
    var successfulInput = false
    do {
        print("Логин: ")
        val userLogin = readln().toString()
        print("Пароль: ")
        val userPassword = readln().toString()

        if (login == userLogin && password == userPassword) successfulInput = true
        else println("Введен неверный логин или пароль. Повторите попытку")
    } while (!successfulInput)

    println("Авторизация прошла успешно")
}