//simple guess the lucky number game... the lucky number is the last number of the ID
fun main() {
    val id = idValidate("Enter your ID number: ")
    val luck = isLucky("Guess the lucky number: ", id)
    println(luck)
}
fun idValidate(prompt: String) :Int {
    do{
        print(prompt)
        val uIn = readln().toIntOrNull()
        if (uIn == null) {
            cls()
            println("Error: Invalid input. Try again.")
        } else {
            cls()
            return uIn
        }
    }while (true)
}
fun getLuckyNumber(id: Int) = id % 10
fun isLucky(prompt: String, id: Int) :String {
    var tries = 0
    do {
        print(prompt)
        val uIn = readln().replace(",","").toIntOrNull()
        if (uIn == null) {
            cls()
            println("Error: Invalid Input! Please try again.")
            continue
        }
        tries++
        if (uIn % 10 != getLuckyNumber(id)) {
            cls()
            println("Oops! $uIn is not the lucky number. Try again!")
        }else {
            cls()
            return """
            Congrats, you got it!
            $uIn is the lucky number!
            It took you $tries ${if (tries==1) "try" else "tries"} to guess it.
        """.trimIndent()
        }
    }while (true)
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