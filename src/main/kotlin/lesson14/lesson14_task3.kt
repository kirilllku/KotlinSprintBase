package lesson14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    val radius: Int,
    color: String
) : Figure(color) {
    override fun area(): Double {
        return radius.toDouble().pow(2) * PI
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    val sideA: Int,
    val sideB: Int,
    color: String
) : Figure(color) {
    override fun area(): Double {
        return (sideA * sideB).toDouble()
    }

    override fun perimeter(): Double {
        return (sideA + sideB).toDouble() * 2
    }
}


fun main() {
    val listOfFigures = listOf<Figure>(
        Rectangle(5, 4, "белый"),
        Rectangle(5, 4, "черный"),
        Circle(5, "белый"),
        Circle(3, "черный")
    )

    val sumOfPerimeterAllBlackFigures = listOfFigures
        .filter { it.color.lowercase() == "черный" }
        .sumOf { it.perimeter() }
    val sumOfAreaAllWhiteFigures = listOfFigures
        .filter { it.color.lowercase() == "черный" }
        .sumOf { it.area() }

    println("Cумма периметров всех черных фигур: $sumOfPerimeterAllBlackFigures")
    println("Cумма площадей всех белых фигур: $sumOfAreaAllWhiteFigures ")
}


