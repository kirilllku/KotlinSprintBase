package lesson7


fun main() {
    print("Введите количество секунд которое нужно засечь: ")
    val userSeconds = readln().toInt()

    for (i in userSeconds downTo 1) {
        println("До конца осталось: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}