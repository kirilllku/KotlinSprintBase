package lesson14

abstract class CelestialBody(
    val name: String,
    val haveAtmosphere: Boolean,
    val canBeLanding: Boolean
)

class Satellite(
    name: String,
    haveAtmosphere: Boolean = false,
    canBeLanding: Boolean = true
) : CelestialBody(name, haveAtmosphere, canBeLanding)

class Planet(
    name: String,
    haveAtmosphere: Boolean,
    canBeLanding: Boolean,
    val listOfSatellite: MutableList<Satellite>?
) : CelestialBody(name, haveAtmosphere, canBeLanding) {
    fun printInfo() {
        println("Название планеты: $name")
        listOfSatellite?.forEachIndexed() { index, satellite ->
            println("Спутник номер ${index + 1}: ${satellite.name}")
        } ?: println("У планеты нет спутников")
    }
}

fun main() {
    val satellite1 = Satellite("Фобос")
    val satellite2 = Satellite("Деймос")
    val planet = Planet(
        name = "Марс",
        haveAtmosphere = true,
        canBeLanding = true,
        listOfSatellite = mutableListOf(
            satellite1,
            satellite2
        )
    )

    planet.printInfo()
}


