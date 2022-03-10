fun main() {
    val num = readLine()!!.toInt()
    if (num > -15 && num <= 12 || num in 15..16 || num >= 19) {
        print("True")
    } else print("False")

}

