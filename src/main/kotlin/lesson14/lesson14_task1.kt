package lesson14

open class Liner(
    val speed: Double = 40.0,
    val capacity: Double = 300000.0,
    val numberOfPassengers: Int = 7500
)

class Cargo(
    speed: Double = 30.0,
    capacity: Double = 500000.0,
    numberOfPassengers: Int = 1000
) : Liner(speed, capacity, numberOfPassengers)

class Icebreaker(
    speed: Double = 25.0,
    capacity: Double = 250000.0,
    numberOfPassengers: Int = 1000,
    val breakIce: Boolean = true
) : Liner(speed, capacity, numberOfPassengers)

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()
}