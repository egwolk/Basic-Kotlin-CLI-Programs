fun main() {
    val num = validate("Enter a number form 1-7 to determine day of the week: ")
    println("$num is ${getDay(num)}")
    print("Press enter to continue...")
    readln()
    cls()
    println("P.S. If you think Sunday is the first day, you are wrong.")
}

fun validate(prompt: String) :Int {
    while (true) {
        print(prompt)
        val uIn = readln().replace(",","").toIntOrNull()
        if (uIn == null || uIn !in 1..7) {
            cls()
            println("Error: Invalid input.")
        }else {
            cls()
            return uIn
        }
    }
}
fun getDay(num:Int) :String {
    return when (num) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Sunday"
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