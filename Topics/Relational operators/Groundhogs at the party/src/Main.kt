fun main() {

    val peanutButterCups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()

    if (isWeekend && peanutButterCups in 15..25) {
        println(true)
    } else if (!isWeekend && peanutButterCups in 1..20) {
        println(true)
    } else {
        println(false)
    }

}