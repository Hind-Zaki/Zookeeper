import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)
    val galacticEmpireShips = scan.nextInt()
    val rebelAllianceShips = scan.nextInt()
    println("${galacticEmpireShips / rebelAllianceShips}")

}