var a = 0
var b = 0
var c = 0
var d = 0


fun main() {

    val numberOfClass = readLine()!!.toInt()


    repeat(numberOfClass){

        val grade = readLine()!!.toInt()
        if (grade == 5) a++
        if (grade == 4) b++
        if (grade == 3) c++
        if (grade == 2) d++
    }
    println("$d $c $b $a")
}

