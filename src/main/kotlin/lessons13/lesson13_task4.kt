package lessons13

class Contact4(
    val name: String,
    _phoneNumber: Long?,
    val company: String? = null
) {
    val phoneNumber = _phoneNumber


    fun printInfo() {
        println(
            "Имя: $name; " +
                    "Номер: $phoneNumber; " +
                    "Компания: ${company ?: "<не указано>"}."
        )
    }
}

fun main() {
    /*val listOfContacts = listOf(
        Contact3("Иван", 89001234576, null),
        Contact3("Семен", 89001234577, null),
        Contact3("Федор", 89001234578, "null"),
        Contact3("Слава", 89001234579, "ОАО Вектор"),
        Contact3("Андрей", 89001234580, "ОАО Вектор"),
    )*/

    //listOfContacts.forEach { it.printInfo() }

    val listOfContacts = mutableListOf<Contact4>()
    listOfContacts.add(addUserInNotebook())

    listOfContacts.forEach { it.printInfo() }

}

fun addUserInNotebook(): Contact4 {
    println("<<<СОЗДАНИЕ НОВОГО КОНТАКТА>>>")

    print("Введите ИМЯ нового контакта: ")
    val nameUser: String = readln().toString()

    print("Введите ТЕЛЕФОН нового контакта: ")
    val phoneNumberUser = readln().toLongOrNull()

    print("Введите НАЗВАНИЕ КОМПАНИИ нового контакта: ")
    val companyUser = readln().toString()

    val userContact = Contact4(nameUser, phoneNumberUser, companyUser)

    return userContact
}