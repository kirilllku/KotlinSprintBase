package lesson4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME_MAX = 100

fun main() {

    val averageWeight1 = 20
    val averageVolume1 = 80

    val averageWeight2 = 50
    val averageVolume2 = 100

    println(
        "Груз с весом $averageWeight1 кг объемом $averageVolume1 л соответствует категории 'Average': " +
                "${averageWeight1 > AVERAGE_WEIGHT_MIN && averageWeight1 <= AVERAGE_WEIGHT_MAX && averageVolume1 < AVERAGE_VOLUME_MAX}"
    )

    println(
        "Груз с весом $averageWeight2 кг объемом $averageVolume2 л соответствует категории 'Average': " +
                "${averageWeight2 > AVERAGE_WEIGHT_MIN && averageWeight2 <= AVERAGE_WEIGHT_MAX && averageVolume2 < AVERAGE_VOLUME_MAX}"
    )
}
