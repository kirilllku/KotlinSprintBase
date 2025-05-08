package lessons_2

fun main() {
    val numberOfEmploees = 50
    val payOfEmploer = 50000
    val numberOfTrainees = 30
    val payOfTrainee = 20000

    val sumPayOfEmploees = numberOfEmploees * payOfEmploer
    val sumPayAll = sumPayOfEmploees + numberOfTrainees * payOfTrainee
    val meanPay = sumPayAll / (numberOfTrainees + numberOfEmploees)

    println(sumPayOfEmploees)
    println(sumPayAll)
    println(meanPay)
}