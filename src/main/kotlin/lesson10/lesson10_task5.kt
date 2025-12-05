package lesson_10

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "qwerty"
val userCart = listOf("яйцо", "помидор", "зелень", "соль", "перец")


fun main() {
    val userLogin = "admin"
    val userPassword = "qwerty"

    val token = autotization(userLogin, userPassword)
    val cart = getCart(token)

    if (cart != null) {
        print("Список продуктов в корзине: ")
        println(cart.joinToString(", "))
    } else {
        println("Неудачная авторизация")
    }
}

fun generateToken(): String {
    val charPool = ('a'..'z') + ('0'..'9')
    val result: MutableList<Char> = mutableListOf()

    for (i in 1..32) {
        val randomIndex = (0 until charPool.size).random()
        result.add(charPool[randomIndex])
    }

    return result.joinToString("")
}

fun autotization(login: String, password: String): String? {
    return if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) generateToken() else null
}

fun getCart(token: String?): List<String>? {
    return if (token != null) userCart else null
}

