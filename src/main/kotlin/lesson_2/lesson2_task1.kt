package lessons_2

fun main() {
    val numberOfStudents = 4
    val assessmentOfStudent1 = 3.0f
    val assessmentOfStudent2 = 4.0f
    val assessmentOfStudent3 = 2.0f
    val assessmentOfStudent4 = 5.0f

    val mean: Float = (assessmentOfStudent1 + assessmentOfStudent2 + assessmentOfStudent3 +assessmentOfStudent4) / numberOfStudents
    println("%.2f".format(mean))
}