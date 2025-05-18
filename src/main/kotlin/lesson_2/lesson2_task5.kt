package lessons_2
import kotlin.math.pow

fun main() {
    val initialBid = 70_000
    val percent = 16.7
    val time = 20

    val sumOfBid = initialBid * ((1 + percent / 100).pow(time))

    println("%.3f".format(sumOfBid))
}