//java program that lets user input total amount of purchase. if purchase > 1000 ask user if they are a member. if yes, give 10% discount, if no give a 5% discount. if purchase is <=1000, tell user they are not legible for discount. if purchase <= 0 tell user that is not a possible amount.
import java.text.DecimalFormat

fun main() {
    println("Welcome to Supermarket Checkout!")
    val purchaseTotal = totalValidation("Enter your purchase total: $")
    if (purchaseTotal > 1000) {
        val membership = isMember("Are you a member? [Y]Yes | [N]No : ")
        println(displayMsg(purchaseTotal, membership))
    }else if (purchaseTotal in 0.99..1000.00) {
        println("Sorry, your purchase total of $${numFormat(purchaseTotal)} is not legible for a discount")
    }else if (purchaseTotal == 0.0) {
        println("Congrats, You bought nothing! Please leave the store!")
    }else println("$${numFormat(purchaseTotal)} is not a possible amount.")

}
fun numFormat(value: Double): String { //number format
    val formatter = DecimalFormat("0.##")
    return if (value % 1.0 == .0) value.toInt().toString() else formatter.format(value)
}

fun displayMsg(total: Double, member: Char) :String{
    return """
        Congrats! You got a ${if (member == 'y') "10%" else "5%"} discount as a ${if(member == 'y') "member" else  "non-member"}.
        $${if (member == 'y') numFormat(memberDisc(total)) else numFormat(nonMemberDisc(total))} has been deducted from your initial purchase total of: $${numFormat(total)}.
        Your new purchase total is: $${if (member == 'y') numFormat(total - memberDisc(total)) else numFormat(total-nonMemberDisc(total))}
    """.trimIndent()
}

fun memberDisc(total: Double) = total * .1
fun nonMemberDisc(total: Double) = total * .05

fun totalValidation(prompt: String) :Double {
    do {
        print(prompt)
        val userIn = readln().toDoubleOrNull()
        if (userIn == null) println("Invalid input. Please try again.") else return userIn
    } while (true)
}

fun isMember(prompt: String) :Char {
    do {
        print(prompt)
        val userIn = readln().lowercase()
        when {
            userIn.length != 1 -> println("Invalid input. One character only.")
            !Regex("[yn]").matches(userIn) -> println("Invalid input. Please try again.")
            //userIn !in listOf("y", "n") -> println("Invalid input. Please try again.") //another way
            else -> return userIn[0]
        }
    }while (true)
}