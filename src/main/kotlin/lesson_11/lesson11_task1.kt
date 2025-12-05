package lesson_11

class User(
    val id: String,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User(
        id = "0001",
        login = "user_1",
        password = "qwerty_1",
        email = "user_1@gmail.com"
    )

    val user2 = User(
        id = "0002",
        login = "user_2",
        password = "qwerty_2",
        email = "user_1@gmail.com"
    )

    println(
        "${user1.id}\n" +
                "${user1.login}\n" +
                "${user1.password}\n" +
                "${user1.email}"
    )
    println()
    println(
        "${user2.id}\n" +
                "${user2.login}\n" +
                "${user2.password}\n" +
                "${user2.email}"
    )
}