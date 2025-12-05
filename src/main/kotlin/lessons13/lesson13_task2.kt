package lessons13

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println(
            "Имя: $name; " +
                    "Номер: $phoneNumber; " +
                    "Компания: ${company ?: "<не указано>"}."
        )
    }
}

fun main() {
    val contactIvan = Contact2("Иван", 89110000000, null)
    contactIvan.printInfo()
}