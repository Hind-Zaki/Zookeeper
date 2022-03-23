fun main() {

    var shouldBreak = false
    val totalNum = readLine()!!.toInt()
    var counter = 0
    for (i in 1..totalNum) {
        for (j in 1..i) {
            if (counter == totalNum) {
                shouldBreak = true
                break
            }
            counter++
            print("$i ")
        }
        if (shouldBreak) {
            break
        }
    }
}
