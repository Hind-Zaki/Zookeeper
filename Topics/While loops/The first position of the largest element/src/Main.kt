import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var postion = 0
    var startPosition = 1

    while (scan.hasNext()) {
        val num = scan.nextInt()
        if (max < num) {
            max = num
            postion = startPosition
        }
        startPosition++
    }

    print("$max $postion")
}