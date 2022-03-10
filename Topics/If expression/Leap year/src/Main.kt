const val FOUR = 4
const val ZERO = 0
const val HUNDRED = 100
const val FOURHUNDRED = 400
const val NINEHUNDRED = 1900
const val THREETHOUSAND = 3000

fun main() {
    val isLeap = readLine()!!.toInt()
    if (isLeap % FOUR == ZERO && isLeap % HUNDRED != ZERO) {
        println("Leap")
    } else if (isLeap in NINEHUNDRED..THREETHOUSAND && isLeap % FOURHUNDRED == ZERO) {
        println("Leap")
    } else {
        println("Regular")
    }
}
