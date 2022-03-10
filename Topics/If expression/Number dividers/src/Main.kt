fun main() {

    val dividedNumber = readLine()!!.toInt()

    if (dividedNumber % 2 == 0) {
        println("Divided by 2")
    }
    if (dividedNumber % 3 == 0) {
        println("Divided by 3")
    }
    if (dividedNumber % 5 == 0) {
        println("Divided by 5")
    }
    if (dividedNumber % 6 == 0) {
        println("Divided by 6")
    }

}