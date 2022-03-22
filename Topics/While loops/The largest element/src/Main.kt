fun main() {

    var maxInput = 0
    do {
        val n = readLine()!!.toInt()
        if (n > maxInput) {
            maxInput = n
        }
    } while (n > 0)
    println(maxInput)

}