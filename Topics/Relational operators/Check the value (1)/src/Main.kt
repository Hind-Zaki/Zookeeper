const val TEN = 10

fun main() {

    val number = readLine()!!.toInt()
    val result = (number in 1..9)
    println(result)

}