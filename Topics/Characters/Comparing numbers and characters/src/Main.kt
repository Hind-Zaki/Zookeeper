fun main() {

    val number = readLine()!!.toInt()
    val char = readLine()!!.first()
    val check = number.toChar() == char
    println(check)
}