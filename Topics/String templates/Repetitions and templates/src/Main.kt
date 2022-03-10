fun main() {

    val word = readLine()!!
    val repeatedTimes = word.length
    println("${word.length} repetitions of the word $word: ${word.repeat(repeatedTimes)}")

}