package lessons_2
import kotlin.math.*

fun main() {
    val initialBid = 70_000
    //val percent = 16.7f
    //val percent = 0.167f
    val percent = 0.167
    val time = 20

    //val sumOfBid = initialBid * ((1 + percent * 0.01).pow(time))
    // percent = 16.7 ANSWER: 1536438,629

    //val sumOfBid = initialBid * ((1 + percent).pow(time))
    // percent = 0.167f ANSWER: 1536438,875

    val sumOfBid = initialBid * ((1 + percent).pow(time))
    //ANSWER: 1536438,629

    println("%.3f".format(sumOfBid))

}