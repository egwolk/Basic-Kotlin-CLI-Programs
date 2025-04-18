//java program that lets user input total amount of purchase. if purchase > 1000 ask user if they are a member. if yes, give 10% discount, if no give a 5% discount. if purchase is <=1000, tell user they are not legible for discount. if purchase <= 0 tell user that is not a possible amount.
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.NumberFormat

fun main() {
    println("Welcome to Supermarket Checkout!")
    val purchaseTotal = totalValidation("Enter your purchase total: ")
    if (purchaseTotal > 1000) {
        val membership = isMember("Are you a member? [Y]Yes | [N]No : ")
        println(displayMsg(purchaseTotal, membership))
    }else if (purchaseTotal in 0.99..1000.00) {
        println("Sorry, your purchase total of $${numFormat(purchaseTotal)} is not legible for a discount")
    }else if (purchaseTotal <= 0) {
        cls()
        println("$${numFormat(purchaseTotal)} is not a possible amount.")
    }

}

fun cls() { //to clear console. *doesn't work on IDE consoles
    try {
        val process = ProcessBuilder("cmd", "/c", "cls").inheritIO().start()
        process.waitFor()
    } catch (e: Exception) {
        try {
            val process = ProcessBuilder("clear").inheritIO().start()
            process.waitFor()
        }catch (ex: Exception) {
            print("")
        }
    }
}

fun numFormat(value: Double): String { //number format
    val roundedValue = BigDecimal(value).setScale(2, RoundingMode.HALF_UP) // Round to 2 decimal places
    val formatter = NumberFormat.getNumberInstance()
    formatter.maximumFractionDigits = 2
    formatter.minimumFractionDigits = 2
    return formatter.format(roundedValue)
}

fun displayMsg(total: Double, member: Char) :String{
    val discount = if (member == 'y') memberDisc(total) else nonMemberDisc(total)
    return """
        Congrats! You got a ${if (member == 'y') "10%" else "5%"} discount as a ${if (member == 'y') "member" else "non-member"}.
        $${numFormat(discount)} has been deducted from your initial purchase total of: $${numFormat(total)}.
        Your new purchase total is: $${numFormat(total - discount)}
    """.trimIndent()

}

fun memberDisc(total: Double) = total * .1
fun nonMemberDisc(total: Double) = total * .05

fun totalValidation(prompt: String) :Double {
    do {
        print(prompt)
        val userIn = readln().replace(",","").toDoubleOrNull()
        if (userIn == null) {
            cls()
            println("Invalid input. Please try again.")
        } else {
            if (userIn < 0 || userIn > 1_000_000) {
                cls()
                println("Amount must be between 0 and 1,000,000.")
                continue
            }
            cls()
            return userIn
        }
    } while (true)
}

fun isMember(prompt: String) :Char {
    do {
        print(prompt)
        val userIn = readln().lowercase()
        when {
            userIn.length != 1 -> {
                cls()
                println("Invalid input. One character only.")
            }
            !Regex("[yn]").matches(userIn) -> {
                cls()
                println("Invalid input. Please try again.")
            }
            //userIn !in listOf("y", "n") -> println("Invalid input. Please try again.") //another way
            else -> {
                cls()
                return userIn[0]
            }
        }
    }while (true)
}