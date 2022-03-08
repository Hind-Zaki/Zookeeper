fun main() {

    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val numberThree = readLine()!!.toInt()
    val result = (numberOne in numberTwo..numberThree ||
            numberOne in numberThree..numberTwo)
    println(result)
}