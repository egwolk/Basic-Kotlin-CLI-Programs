//simple program to determine if user input is a positive, a negative number or just neither
fun main() {
    val userInput = inputValidation("Enter a number: ")

    when {
        userInput > 0 -> println("${numberFormat(userInput)} is a positive number.")
        userInput < 0 -> println("${numberFormat(userInput)} is a negative number.")
        else -> println("0 is neither a positive nor a negative number.")
    }
}

fun inputValidation(prompt: String): Double {
    do {
        print(prompt)
        val userInput :Double? = readln().toDoubleOrNull()
        if (userInput == null) println("Invalid input. Please enter a number.") else return userInput
    }while (true)
}

fun numberFormat(num: Double) :String {
    //alternative if logic: num == num.toInt().toDouble()
    return if (num % .1 != .0) num.toInt().toString() else num.toString()
}