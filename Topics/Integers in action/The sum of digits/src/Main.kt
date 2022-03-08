import java.util.*

fun main() {

    var n: Int
    var r: Int
    var s = 0
    var sc = Scanner(System.`in`)
    n = sc.nextInt()

    while (n > 0) {
        r = n % 10
        s += r
        n /= 10
    }
    println(s)

}