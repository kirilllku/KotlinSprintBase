package lessons13

class Contact3(
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
    val listOfContacts = listOf(
        Contact3("Иван", 89001234576, null),
        Contact3("Семен", 89001234577, null),
        Contact3("Федор", 89001234578, "null"),
        Contact3("Слава", 89001234579, "ОАО Вектор"),
        Contact3("Андрей", 89001234580, "ОАО Вектор"),
    )

    listOfContacts.forEach { it.printInfo() }
}