fun main() {

    naturalNumber()

}

private fun naturalNumber() {
    val inputNum = readLine()!!.toInt()
    var n = 1
    var i = 0
    var x: Int

    while (i <= inputNum) {
        i++
        x = n * n
        n++
        if (x <= inputNum) println(x)
    }
}