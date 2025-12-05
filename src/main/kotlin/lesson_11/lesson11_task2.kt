package lesson_11

class User2(
    val id: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String
) {
    fun ptintInfo() {
        println("id пользователя: $id")
        println("login пользователя: $login")
        println("password пользователя: $password")
        println("email пользователя: $email")
        println("bio пользователя: $bio")
    }

    fun changeBio() {
        print("Заполните поле bio: ")
        bio = readln().toString()
    }

    fun changePassword() {
        print("ИМЕНЕНИЕ ПАРОЛЯ\nВведите старый пароль: ")
        if (readln().toString() == password) {
            print("Введите новый пароль: ")
            val newPassword = readln().toString()
            password = newPassword
            println("Новый пароль успешно создан.")
        } else {
            println("Пароль введен неверно.")
        }
    }
}

fun main() {
    val user21 = User2(
        id = "0001",
        login = "user_1",
        password = "qwerty",
        email = "user_1@gmail.com",
        bio = "LALALA_1"
    )

    println("ИЗМЕНЕНИЕ bio ПОЛЬЗОВАТЕЛЯ")
    user21.changeBio()
    user21.changePassword()
    println()
    println("НОВЫЕ ДАННЫЕ ПОЛЬЗОВАТЕЛЯ")
    user21.ptintInfo()
}
