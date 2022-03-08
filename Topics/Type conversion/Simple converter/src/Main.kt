import java.util.Scanner

fun main() {

    // 1-
    val scanConverter = Scanner(System.`in`)
    val typeInput = scanConverter.next()

    println(typeInput.toInt())
    println(typeInput.toDouble())
    println(typeInput.toBoolean())

}