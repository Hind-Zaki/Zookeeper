fun main() {
    var balance = readLine()!!.toInt()
    var withdrawn = 0

    while (balance != 0)
        if (balance >= withdrawn) {
            withdrawn = readLine()!!.toInt()
            balance -= withdrawn

            println("Thank you for choosing us to manage your account! Your balance is $balance")
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $withdrawn.")
            break
        }


}