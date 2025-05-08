package lesson_3

fun main()  {
    var moveFromWhere = "E2"
    var moveToWhere = "E4"
    var numberOfMove = 1

    val move1 = "[$moveToWhere-$moveFromWhere;$numberOfMove]"
    println(move1)

    moveFromWhere = "D2"
    moveToWhere = "D3"
    numberOfMove = 3
    val move2 = "[$moveFromWhere-$moveToWhere;$numberOfMove]"
    println(move2)
}
