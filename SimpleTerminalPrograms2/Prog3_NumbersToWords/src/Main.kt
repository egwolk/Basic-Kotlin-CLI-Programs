// convert numbers into words
import java.text.NumberFormat

fun main() {
    while (true) {
        val action = options("""
            Pick an option from the selection
            [A] Input a number and convert it to words.
            [B] See all numbers converted to words.
            [C] Exit program.
            Your action: 
        """.trimIndent())
        when (action) {
            'a' -> {
                val num = validate("Enter a positive whole number from 0-9,999: ")
                println("${numFormat(num)} is ${numToWords(num)}.")
                print("Press enter to continue...")
                readln()
                cls()
            }
            'b' -> printAllNumbers()

            else -> {
                cls()
                println("Goodbye!")
                break
            }
        }
    }

}
fun validate(prompt: String) :Int {
    while (true) {
        print(prompt)
        when (val uIn = readln().replace(",","").toIntOrNull()) {
            null -> {
                cls()
                println("Error: Invalid Input!")
            }
            !in 0..9_999 -> {
                cls()
                println("Error: Number not in range.")
            }
            else -> {
                cls()
                return uIn
            }
        }
    }
}
fun getOnes(num: Int) = num % 10
fun getTens(num: Int) = (num % 100) - (num % 10)
fun getHundreds(num: Int) = ((num % 1_000) - (num % 100)) / 100
fun getThousands(num: Int) = ((num % 10_000) - (num % 1_000)) / 1000

fun numToWords (num: Int) :String {
    return when (num) {
        0 -> "zero"
        in 1..9 -> onesToWords(num)
        in 10..19 -> teensToWords(num)
        in 20..99 -> tensAndOnes(num)
        in 100..999 -> hundredsTensAndOnes(num)
        else -> thousandsHundredsTensAndOnes(num)
    }
}
fun onesToWords(num: Int) :String {
    return when (num) {
        0 -> ""
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        7 -> "seven"
        8 -> "eight"
        else -> "nine"
    }
}
fun teensToWords(num: Int) :String{
    return when (num) {
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        14 -> "fourteen"
        15 -> "fifteen"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"
        else -> "nineteen"
    }
}
fun tensToWords(num: Int) :String {
    return when (num) {
        20 -> "twenty"
        30 -> "thirty"
        40 -> "forty"
        50 -> "fifty"
        60 -> "sixty"
        70 -> "seventy"
        80 -> "eighty"
        else -> "ninety"
    }
}
fun tensAndOnes(num: Int) :String{
    return "${tensToWords(getTens(num))} ${onesToWords(getOnes(num))}"
}
fun determineTen(num: Int) :String {
    return when (getTens(num) / 10) {
        1 -> teensToWords(getTens(num)+getOnes(num))
        0 ->  onesToWords(getOnes(num))
        else -> tensAndOnes(num)
    }
}
fun hundredsTensAndOnes(num: Int) :String {
    return "${onesToWords(getHundreds(num))} hundred ${determineTen(num)}"

}
fun thousandsHundredsTensAndOnes(num: Int) :String {
    return "${onesToWords(getThousands(num))} thousand " +
            if (getHundreds(num) == 0) determineTen(num) else hundredsTensAndOnes(num)
}
fun options(prompt: String) :Char{
    while (true) {
        print(prompt)
        val uIn = readln().lowercase().trim()
        when {
            uIn.length > 1 -> {
                cls()
                println("Error: Enter one character only.")
            }
            !Regex("[abc]").matches(uIn) -> {
                cls()
                println("Error: Invalid Input!")
            }
            else -> {
                cls()
                return uIn[0]
            }
        }
    }
}
fun printAllNumbers() {
    for (num in 0..9_999) {
        println("${numFormat(num)} is ${numToWords(num)}.")
        if (num % 1000 == 999) {
            print("Press enter to continue...")
            readln()
            cls()
        }
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
fun numFormat(num: Int) :String {
    val formatter = NumberFormat.getNumberInstance()
    return formatter.format(num)
}

