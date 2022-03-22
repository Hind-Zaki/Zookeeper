fun main() {

    var n = readLine()!!.toInt()
    while (n != 1) {
        print("$n ")

        n = if (n and 1 == 1) 3 * n + 1 else n / 2
    }
    print(n)
}