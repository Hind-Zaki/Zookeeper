fun main() {

    var n = 0
    do {
        val numberInput = readLine()!!.toInt()
        n++

    } while (numberInput > 0)
    println(n - 1)
}