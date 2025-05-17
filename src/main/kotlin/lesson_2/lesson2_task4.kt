package lessons_2

fun main() {
    val numberOfCrystals = 7
    val numberOfMinerals = 11
    val buff = 20

    val bonusOfCrystals = (numberOfCrystals * buff.toFloat() / 100).toInt()
    val bonusOfMinerals = (numberOfMinerals * buff.toFloat() / 100).toInt()

    println("$bonusOfCrystals crystals")
    println("$bonusOfMinerals minerals")
}