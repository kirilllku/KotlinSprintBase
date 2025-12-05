package lessons13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val contactIvan = Contact("Иван", 89110000000, null)
}