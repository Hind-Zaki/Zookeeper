fun main() {
    val (second, minute, hour) = readLine()!!.split(' ')
    val (day, month, year) = readLine()!!.split(' ')
    print("$second:$minute:$hour $day/$month/$year")

}