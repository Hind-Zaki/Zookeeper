fun main() {

    val number = readln().toInt()
    val list = List(number) {
        readLine()!!.toInt()
    }
    print("${list.count { it > 0 }} ")


}