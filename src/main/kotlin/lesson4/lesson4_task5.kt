package lesson4

const val MIN_TEAM_SHIP_1 = 55
const val MAX_TEAM_SHIP_1 = 70
const val TEAM_SHIP_2 = 70
const val BOX = 50

fun main() {
    val noDamage: Boolean
    val team: Int
    val box: Int
    val weatherIsGood: Boolean

    println("Корабль НЕ ИМЕЕТ повреждения? true/false: ")
    noDamage = readln().toBoolean()
    println("Число экипажа на корабле? Введите число: ")
    team = readln().toInt()
    println("Количество ящиков на борту? Введите число: ")
    box = readln().toInt()
    println("Погода благоприятная? true/false: ")
    weatherIsGood = readln().toBoolean()

    val shipWillLeave =
        (noDamage && (team in MIN_TEAM_SHIP_1 until MAX_TEAM_SHIP_1) && (box > BOX) && weatherIsGood) || (team == TEAM_SHIP_2 && (box >= BOX) && weatherIsGood || noDamage)

    if (shipWillLeave) {
        println("Kорабль отправиться в плавание")
    } else {
        println("Kорабль не сможет отправиться в плавание")
    }
}


