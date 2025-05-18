package lesson4

const val HEAND: Boolean = true
const val PRESS: Boolean = true
const val FOOT: Boolean = false
const val BACK: Boolean = false

fun main() {

    val day = 5
    val evanDay: Boolean = day % 2 == 0

    println(
        """
  Упражнения для рук:    ${HEAND != evanDay}
  Упражнения для ног:    ${FOOT != evanDay}  
  Упражнения для спины:  ${BACK != evanDay}
  Упражнения для пресса: ${PRESS != evanDay}
    
    """
    )
}


