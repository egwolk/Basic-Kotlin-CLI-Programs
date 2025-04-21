fun main() {
    val coins =  coinLoop()
    println("Your Coins: $coins")
}
fun coinLoop() :Int{
    var coin :Int
    var coins = 0
    while (true) {
         coin = coinValidate("""
            Valid Coins -> [20] [10] [5] [1] [0 = Finish]
            Inserted Coins: $coins
            Insert Coins: 
        """.trimIndent())
        if (coin == 0) {
            break
        }
        coins += coin
    }
    return coins
}

fun coinValidate(prompt: String) :Int {
    while (true) {
        print(prompt)
        when (val coin = readln().trim().toIntOrNull()) {
            null -> {
                println("Error: Invalid Input.")
            }
            !in listOf(1, 5, 10, 20, 0) -> {
                println("Error: Please insert a valid coin!")
            }
            else -> return coin
        }
    }
}