import kotlin.math.roundToInt

// money denominations program

const val maxMoney = 9_999_999 //should be enough for a simple CLI program. also anything beyond that gets converted to scientific notation.
fun main() {
    val denominations = arrayOf(100f, 50f, 20f, 10f, 5f, 2f, 1f, .50f, .25f, .10f, .05f, .01f)
    while (true){
        val money = doubleValidation("Enter the amount of money you have: ")
        println("You Entered: ${numFormat(money)}")
        print("Press enter to continue...")
        readln()
        cls()
        println("Total denominations:")
        val totalDenominations = preCalc(money, denominations)
        display(totalDenominations)
        print("Press enter to continue...")
        readln()
        cls()
        val isRestart = yn("Do you want to start again? [Y] Yes | [N] No: ")
        if (isRestart == 'n') {
            println("Bye-bye!")
            break
        }
    }
}
//method overloading
fun numFormat(money: Float) :String {
    return if (money in .01f.. .99f) {
        "¢${(money * 100).toInt()}"
    }  else if (money % 1f == 0f) {
        "$%,d".format(money.toInt())
    } else {
        "$%,.2f".format(money)
    }
}fun numFormat(money: Int) :String {
    return "%,d".format(money)
}
fun yn(prompt: String) :Char {
    while (true) {
        print(prompt)
        val input = readln().lowercase().trim()
        when {
            input.length != 1 -> {
                cls()
                println("Error: Please enter one character only.")
            }
            !Regex("[yn]").matches(input) -> {
                cls()
                println("Error: Please enter a character from the selection.")
            }
            else -> {
                cls()
                return input[0]
            }
        }
    }
}


fun doubleValidation(prompt: String) :Float {
    while (true) {
        print(prompt)
        val input = readln().replace(",","").toFloatOrNull()
        when {
            input == null -> {
                cls()
                println("Error: Invalid input!")
            }
            input <= 0 -> {
                cls()
                println("Wowza, you're extremely poor! Unfortunately you cannot get denominations if you have 0 to negative amounts of money :[")
            }
            input > maxMoney -> {
                cls()
                println("WOW! You're so rich, the program can't handle your wealth!")
            }
            else -> {
                cls()
                return input
            }
        }
    }
}
fun getDenomination(money: Float, moneyVal: Float) = (money / moneyVal).toInt()
fun runningAmt(moneyAmt: Int, moneyVal: Float, money: Float) = ((money - moneyAmt * moneyVal ) * 100).roundToInt() / 100f


fun  preCalc(money:Float, array: Array<Float>) :List<MutableList<Any>>{
    var run = (money * 100).roundToInt() / 100f
    val results = mutableListOf<MutableList<Any>>()
    for (i in array.indices) {
        val result = getDenomination(run, array[i])
        if (result == 0) continue
        run = runningAmt(result, array[i], run)
        results.add(mutableListOf(array[i], result))
    }
    return results
}


fun display(moneyAmt: List<MutableList<Any>>) {
    val totals = arrayListOf<Float>()
    var grandTotal = 0f
    for (i in moneyAmt) {
        val moneyVal = i[0] as Float
        val denominations = i[1] as Int
        val total = moneyVal * denominations
        totals.add(total)
        grandTotal += total
        println(printMoney(moneyVal, denominations, total))
    }
    println("""
        Validation:
        ${totals.joinToString(" + ") { numFormat(it) }} = ${numFormat(grandTotal)}
    """.trimIndent())
}
fun printMoney(moneyVal: Float,denominations: Int, total:Float) = "${numFormat(moneyVal)} * ${numFormat(denominations)} = ${numFormat(total)}"

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