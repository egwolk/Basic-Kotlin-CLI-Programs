//simple program to determine if user input is a positive, a negative number or just neither
fun main() {
    val userInput = inputValidation("Enter a number: ")

    when {
        userInput > 0 -> println("${numberFormat(userInput)} is a positive number.")
        userInput < 0 -> println("${numberFormat(userInput)} is a negative number.")
        else -> println("0 is neither a positive nor a negative number.")
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

fun inputValidation(prompt: String): Double {
    do {
        print(prompt)
        val userInput :Double? = readln().toDoubleOrNull()
        if (userInput == null) {
            cls()
            println("Invalid input. Please enter a number.")
        } else {
            cls()
            return userInput
        }
    }while (true)
}

fun numberFormat(num: Double) :String {
    //alternative if logic: num == num.toInt().toDouble()
    return if (num % .1 != .0) num.toInt().toString() else num.toString()
}