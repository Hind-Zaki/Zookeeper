fun main() {

    var sum = 0
    var input: Int

    do {
        input = readLine()!!.toInt()
        sum += input

    } while (input != 0)

    println("$sum")

}
