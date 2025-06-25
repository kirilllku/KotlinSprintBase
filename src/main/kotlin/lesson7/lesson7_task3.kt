package lesson7

const val maxULong = ULong.MAX_VALUE

fun main() {
    print("Введите любое число от 0 до $maxULong (включтельно): ")
    val userNumber: ULong = readln().toULong()

    for (i in 0UL..userNumber step 2) {
        println(i)
    }
}