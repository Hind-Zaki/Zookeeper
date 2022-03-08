fun main() {

    val invite = readLine().toBoolean()

    val hasGift = readLine().toBoolean()

    if (invite && hasGift) {
        println(true)
    } else {
        println(false)
    }

    // 2-

    val invitation = readLine().toBoolean() // read other value in the same way
    val gift = readLine().toBoolean()
    val eligible = invitation && gift
    if (eligible) {
        println(true)
    } else println(false)


    // -3
    val invitations = readln().toBoolean()
    val gifts = readln().toBoolean()

    println(invitations && gifts)

}