import java.math.BigDecimal
import java.math.RoundingMode
import java.text.NumberFormat

const val a = 1200.00
const val b = 1500.00
const val c = 1600.00
fun main() {
    val fn = strValid("Enter First Name: ")
    val ln = strValid("Enter Last Name: ")
    displayGreeting(fn, ln)
    val pack = choosePackage("""
        Please choose your package from the our fine selection this season.
        [a] Tour = $${numFormat(a)}
        [b] Island Hoping = $${numFormat(b)}
        [c] Ship Wrecks = $${numFormat(c)}
        Your package of choice: 
    """.trimIndent())
    val acc = accommodate("How many would you like to accommodate? : ")
    val pay = travelCost(pack, acc)
    println("Your total is: $${numFormat(pay)}")
    print("Press any key to continue...") //This is for cmd/bash interface. Press enter when running on IDE.
    System.console()?.reader()?.read()
    val credit = isYes("Would You like to pay via credit? [Y]Yes | [N]No: ")
    var install = 'n'
    var monthly = 0.00
    when (credit) {
        'y' -> {
            if (pay > 4000.00) {
                install = isYes("Would you like to pay via installment within ${if (pay in 4000.00..7999.00) 3 else 6}-months?  [Y]Yes | [N]No: ")
                if (install == 'y') {
                    monthly = monthlyInstallment(pay)
                }
            }
            println(lastGreet(pay, credit, install, monthly))
        }
        else -> println(lastGreet(pay, credit, install, monthly))
    }

}
fun strValid(prompt: String) :String {
    do {
        print(prompt)
        val uIn = readln().trim()
        if (uIn.isEmpty()){
            cls()
            println("Error. Invalid Input.")
        } else {
            cls()
            return uIn
        }
    }while (true)
}
fun displayGreeting(fn: String, ln: String) {
    cls()
    println("""
        Hello, $fn $ln!
        Thank you for choosing Kotlin Travel Tours to partner up with you and your vacation endeavors!
    """.trimIndent())
    print("Press any key to continue...") //This is for cmd/bash interface. Press enter when running on IDE.
    System.console()?.reader()?.read()
    cls()
}
fun choosePackage(prompt: String) :Char {
    do {
        print(prompt)
        val uIn = readln().lowercase().trim()
        when {
            uIn.length > 1 -> {
                cls()
                println("Invalid input, please enter one character only.")
            }
            !Regex("[abc]").matches(uIn) -> {
                cls()
                println("Invalid input, please enter a valid letter from the selection.")
            }
            else -> {
                cls()
                return uIn[0]
            }
        }
    }while (true)
}
fun accommodate(prompt: String) :Int {
    do {
        print(prompt)
        val uIn = readln().toIntOrNull()
        if (uIn == null || uIn == 0) {
            cls()
            println("Invalid Input.")
        } else {
            cls()
            return uIn
        }
    }while (true)
}
fun travelCost(pack: Char, qty: Int) :Double {
    return when (pack) {
        'a' -> a * qty
        'b' -> b * qty
        else -> c * qty
    }
}
fun isYes(prompt: String) :Char {
    do {
        print(prompt)
        val uIn = readln().lowercase().trim()
        when {
            uIn.length > 1 -> {
                cls()
                println("Invalid input, please enter one character only.")
            }
            !Regex("[yn]").matches(uIn) -> {
                cls()
                println("Invalid input, please try again.")
            }
            else -> {
                cls()
                return uIn[0]
            }
        }
    }while (true)
}
fun monthlyInstallment(pay: Double) :Double{
    return when (pay) {
        in 4000.00..7999.99 -> pay / 3f
        else -> pay / 6f
    }
}
fun lastGreet(pay: Double, cred: Char, install: Char, monthly: Double) :String {
    return when{
        cred == 'y' && install == 'y' -> """
            Thank you for transacting with us!
            You have chosen to pay via a ${if (pay in 4000f..7999f) 3 else 6}-month installment plan.
            You will be paying us $${numFormat(monthly)} every month.
            Have a safe and happy trip!
        """.trimIndent()
        else -> """
            Thank you for transacting with us!
            You have chosen to pay the full amount upfront ${if (cred == 'y') "via credit" else "in cash"}.
            You have paid us $${numFormat(pay)}.
            Have a safe and happy trip!
        """.trimIndent()
    }
}
fun numFormat(value: Double): String { //number format
    val roundedValue = BigDecimal(value).setScale(2, RoundingMode.HALF_UP) // Round to 2 decimal places
    val formatter = NumberFormat.getNumberInstance()
    formatter.maximumFractionDigits = 2
    formatter.minimumFractionDigits = 2
    return formatter.format(roundedValue)
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
