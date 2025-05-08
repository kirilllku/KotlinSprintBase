package lesson4

const val ALL_TABLES = 13

fun main() {
    val tablesBookedToToday = 13
    val tablesBookedToTomorrow = 13

    println("[Доступность столиков на сегодня: " +
            "${tablesBookedToToday < ALL_TABLES}],\n" +
            "[Доступность столиков на завтра: " +
            "${tablesBookedToTomorrow < ALL_TABLES}]."
    )
}