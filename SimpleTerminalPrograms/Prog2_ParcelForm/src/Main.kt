//simple form program

fun main() {
    println("Welcome to the Parcel Delivery Form!")
    val fName = getValidStringInput("Enter Firstname: ")
    val lName = getValidStringInput("Enter Lastname: ")
    val houseNo = getValidIntInput("Enter House No: ")
    val st = getValidStringInput("Enter Street: ")
    val vil = getValidStringInput("Enter Village: ")
    val city = getValidStringInput("Enter City: ")
    val prov = getValidStringInput("Enter Province: ")
    val cnt = getValidStringInput("Enter Country: ")

    displayParcelDetails(fName, lName, houseNo, st, vil, city, prov, cnt)
    println("Thank you! Your delivery details have been successfully recorded.")
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

fun getValidStringInput(prompt: String): String {
    var input: String
    do {
        print(prompt)
        input = readln().trim()
        if (input.isEmpty()) {
            cls()
            println("Invalid input. Please try again.")
        }else cls()
    } while (input.isEmpty())
    return input
}

fun getValidIntInput(prompt: String): Int {
    do {
        print(prompt)
        val input = readln().toIntOrNull()
        if (input != null) {
            cls()
            return input
        }else {
            cls()
            println("Invalid input. Please enter a valid number.")
        }
    } while (true)
}

fun displayParcelDetails(fName: String, lName: String, houseNo: Int, st: String, vil: String, city: String, prov: String, cnt: String) {
    println("""
        Hello, $fName $lName!
        Your parcel will be delivered at: #$houseNo $st St. $vil Village, $city City, $prov, $cnt 
    """.trimIndent())
}
