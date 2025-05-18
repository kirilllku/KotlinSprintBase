package lesson_3

fun main()  {

    val str = "D2-D4;0"

    val moveFromWhere = str.substring(0, 2)
    val moveToWhere = str.substring(3, 5)
    val numberOfMove = str.substring(6)

    println(moveFromWhere)
    println(moveToWhere)
    println(numberOfMove)
}
