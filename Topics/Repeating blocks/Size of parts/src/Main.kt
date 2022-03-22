fun main() {
    val n = readLine()!!.toInt()
    var perfect = 0
    var larger = 0
    var smaller = 0

    repeat (n) {
        val c =readLine()!!.toInt()

        if (c == 0) perfect++

        if (c < 0) smaller++

        if (c > 0) larger++
    }
    print("$perfect $larger $smaller")
}