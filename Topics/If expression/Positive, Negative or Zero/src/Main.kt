fun main() {
    val numberInput = readLine()!!.toInt()
    if (numberInput < 0) {
        println("negative")
    } else if (numberInput == 0) {
        println("zero")
    } else {
        println("positive")
    }
}
