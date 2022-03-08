const val FOUR = 4
fun main() {

    List(FOUR) {
        readln().first()
    }.forEach {
        println(it.isDigit())

    }
}