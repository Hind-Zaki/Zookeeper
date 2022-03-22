fun main() {

    val n = readln().toInt()
    var maxInput = 0

    repeat(n) {
        val next = readln().toInt()
        if (next % 4 == 0 && next > maxInput) {
            maxInput = next
        }
    }
    println(maxInput)

}