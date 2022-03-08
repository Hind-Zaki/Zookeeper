fun main() {

    val char = readLine()!!.first()

    val isDigit = char in '\u0031'..'\u0039'
    val isInCap = char in '\u0041'..'\u005A'

    if (isDigit || isInCap) {
        println(true)

    } else {

        println(false)
    }
}