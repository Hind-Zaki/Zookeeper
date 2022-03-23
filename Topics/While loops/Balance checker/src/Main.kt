import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    var balance: Int = readln().toInt()
    var purchase = 0

    while (scanner.hasNextInt()) {
        val newPurchases = scanner.nextInt()
        if (newPurchases > balance) {
            purchase = newPurchases
            break
        }
        balance -= newPurchases
    }

    if (purchase > 0) {
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
    } else {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}