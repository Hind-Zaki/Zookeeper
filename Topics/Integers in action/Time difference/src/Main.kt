fun main() {

    val h = readln().toInt()
    val m = readln().toInt()
    val s = readln().toInt()

    val h1 = readln().toInt()
    val m1 = readln().toInt()
    val s1 = readln().toInt()

    val first = h * 60 * 60 + m * 60 + s
    val second = h1 * 60 * 60 + m1 * 60 + s1

    println(second - first)

}