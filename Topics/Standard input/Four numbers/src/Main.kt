import java.util.*

fun main() {

    // 1-
    val scanner = Scanner(System.`in`)

    val n1 = scanner.next()
    val n2 = scanner.next()
    val n3 = scanner.next()
    val n4 = scanner.next()
    println(n1)
    println(n2)
    println(n3)
    println(n4)
    println("-----------")

    // 2-
    val scan = Scanner(System.`in`)
    repeat(4) { println(scan.nextInt()) }

    println("-----------")


    // 3-

    readLine()!!.split(" +".toRegex()).forEach { println(it) }

    println("-----------")


    // 4-
    val scanne = Scanner(System.`in`)
    // put your code here
    println(scanne.nextInt())
    println(scanne.nextInt())
    println(scanne.nextInt())
    println(scanne.nextInt())
    println("-----------")


    // 4-
    val sc = Scanner(System.`in`)
    while (sc.hasNext()) {
        println(sc.nextInt())
    }
}