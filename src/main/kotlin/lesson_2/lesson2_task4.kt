package lessons_2

fun main() {
    val numberOfCrystals = 7
    val numberOfMinerals = 11
    val buff = 0.2

    val bonusOfCrystals = (numberOfCrystals * buff).toInt()
    val bonusofMinerals = (numberOfMinerals * buff).toInt()

    println("${bonusOfCrystals} crystals")
    println("${bonusofMinerals} minerals")
}