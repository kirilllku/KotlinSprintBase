package lesson_3

fun main()  {
    val greetingAfternoon = "Доброго дня"
    val greetingEvening = "Доброго вечера"
    val name = "Иван"

    var greeting = "$greetingAfternoon, $name!"
    println(greeting)

    greeting = "$greetingEvening, $name!"
    println(greeting)
}