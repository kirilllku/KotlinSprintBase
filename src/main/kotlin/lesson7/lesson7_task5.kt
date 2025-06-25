package lesson7

fun main() {
    var userLengthPassword: Int
    while (true) {
        print("Укажите длину пароля для генерации (минимальная длина 6 символов): ")
        userLengthPassword = readln().toInt()

        if (userLengthPassword < 6) continue
        else break
    }

    val digits = ('0'..'9').toList()
    val lowercase = ('a'..'z').toList()
    val uppercase = ('A'..'Z').toList()
    val allChars = digits + lowercase + uppercase

    val passwordChars = mutableListOf<Char>()
    passwordChars.add(digits.random())
    passwordChars.add(lowercase.random())
    passwordChars.add(uppercase.random())

    for (i in 4..userLengthPassword) {
        passwordChars.add(allChars.random())
    }

    passwordChars.shuffle()
    println("Пароль сгенерирован: ${passwordChars.joinToString("")}")

}