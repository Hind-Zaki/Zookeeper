import java.util.Scanner

fun main() {
    // 1-
    val scanner = Scanner(System.`in`)
    val input = scanner.nextDouble()
    println(input.toLong())


    // 2-
    val inputRead = readLine()!!
    val inputReadToDouble = inputRead.toDouble()
    val doubleToLong = inputReadToDouble.toLong()
    println(doubleToLong)

}