const val soda = 50
const val water = 20
const val juice = 18
fun main() {
    val coins =  coinLoop()
    println("Your Coins: $coins")
    val drinkChoice = drinkValid("""
        Select a drink option
        [a] Soda  | Price: $soda
        [b] Water | Price: $water
        [c] Juice | Price: $juice
        Your Choice: 
    """.trimIndent())
    val drinkPrice = pickDrink(drinkChoice)
    coinsEnough(coins, drinkPrice)
}
fun coinsEnough(coins: Int, drinkP: Int) {
    if (coins < drinkP) {
        println("You do not have enough to buy that drink")
    }else if (coins == drinkP) {
        println("Drink successfully bought! You have no change.")
    }else {
        println("Drink successfully bought! Your change is ${coins - drinkP}")
    }
}
fun pickDrink(choice: Char) :Int {
    return when (choice) {
        'a' -> soda
        'b' -> water
        else -> juice
    }
}

fun drinkValid(prompt: String) :Char{
    while (true) {
        print(prompt)
        val drink = readln().trim().lowercase()
        when {
            drink.length > 1 -> println("Error: Please enter one character only.")
            !Regex("[abc]").matches(drink) -> println("Error: Please choose from the selection.")
            else -> return drink[0]
        }
    }
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