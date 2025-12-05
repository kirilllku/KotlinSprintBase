package lesson14

open class Liner2(
    val speed: Double = 40.0,
    val capacity: Double = 300000.0,
    val numberOfPassengers: Int = 7500
) {
    open fun loading() {
        println("Происходит погрузка. Лайнер выдвигает горизонтальный трап со шкафута.")
    }

    open fun printInfo() {
        println("Тип судна: ${this::class.simpleName}")
        println("Скорость: $speed км/ч")
        println("Грузопоъемность: $capacity тонн")
        println("Вместимость: $numberOfPassengers человек")
    }
}

class Cargo2(
    speed: Double = 30.0,
    capacity: Double = 500000.0,
    numberOfPassengers: Int = 1000
) : Liner2(speed, capacity, numberOfPassengers) {
    override fun loading() {
        println("Происходит погрузка. Грузовой корабль активирует погрузочный кран.")
    }
}

class Icebreaker2(
    speed: Double = 25.0,
    capacity: Double = 250000.0,
    numberOfPassengers: Int = 1000,
    val breakIce: Boolean = true
) : Liner2(speed, capacity, numberOfPassengers) {
    override fun loading() {
        println("Происходит погрузка. Ледокол открывает ворота со стороны кормы.")
    }

    override fun printInfo() {
        super.printInfo()
        println(if (breakIce) "Может колоть лёд" else "Не колет лёд")
    }
}

fun main() {
    val liner = Liner2()
    val cargo = Cargo2()
    val icebreaker = Icebreaker2()

    liner.printInfo()
    liner.loading()
    println()
    cargo.printInfo()
    cargo.loading()
    println()
    icebreaker.printInfo()
    icebreaker.loading()
}