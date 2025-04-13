//program that allows user to input 2 numbers and program will ask user to choose an operation and will display either sum, difference, product, quotient, or remainder of the 2 numbers.

private const val UNDEFINED = "UNDEFINED"
fun main() {
    while (true) {
        val n1 = isDouble("Enter 1st number: ")
        val n2 = isDouble("Enter 2nd number: ")
        val clN1 = numFormat(n1)
        val clN2 = numFormat(n2)


        val op :Char = pickOp("""
            [+] Addition
            [-] Subtraction
            [*] Multiplication
            [/] Division
            [%] Modulo
            Pick an operation: 
        """.trimIndent())
        when (op) {
            '+' -> println("$clN1 + $clN2 = ${numFormat(getSum(n1, n2))}")
            '-' -> println("$clN1 - $clN2 = ${numFormat(getDif(n1, n2))}")
            '*' -> println("$clN1 * $clN2 = ${numFormat(getPro(n1, n2))}")
            '/' -> { val quo = getQuo(n1, n2)
                println("$clN1 / $clN2 =  ${quo?.let {numFormat(it)} ?: UNDEFINED}")}
            '%' -> {val mod = getMod(n1, n2)
                println("$clN1 % $clN2 =  ${mod?.let {numFormat(it)} ?: UNDEFINED}")}
        }
        print("Press any key to continue...")
        System.console()?.reader()?.read()
        cls()
        val res :Char = restart("Start again? [Y] Yes | [N] No: ")
        if (!res.equals('y',true)) {
            println("Goodbye!")
            break
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

fun pickOp(prompt: String):Char { //operator input validation
    var c: Char? = null
    do {
        print(prompt)
        val uIn = readln()
        if (uIn.length != 1 || !uIn.matches(Regex("[+\\-*/%]"))){
            cls()
            println("Invalid input.")
        } else {
            cls()
            c = uIn[0]
        }
    }while(c==null)
    return c
}

fun restart(prompt: String):Char { // for program restart
    var c: Char? = null
    do {
        print(prompt)
        val uIn = readln().lowercase()
        if (uIn.length != 1 || !(uIn.equals("y",true) ||uIn.equals("n",true))) {
            cls()
            println("Invalid input.")
        } else {
            cls()
            c = uIn[0]
        }
    }while(c==null)
    return c
}
fun numFormat(value: Double): String { //number format
    return if (value % 1.0 == 0.0) value.toInt().toString() else "%.2f".format(Math.round(value * 100) / 100.0)
}

fun isDouble(prompt: String):Double { //number input validation
    var n : Double?
    do{
        print(prompt)
        n = readln().toDoubleOrNull()
        if (n == null) {
            cls()
            println("Invalid input. Please enter a valid integer.")
        }
    }while(n == null)
    cls()
    return n
}

//Arithmetic operations
fun getSum(a: Double, b:Double) = a + b
fun getDif(a: Double, b:Double) = a - b
fun getPro(a: Double, b:Double) = a * b
fun getQuo(a: Double, b:Double) :Double? {
    return if (b == .0) null else a / b
}
fun getMod(a: Double, b:Double) :Double? {
    return if (b == .0) null else a % b
}