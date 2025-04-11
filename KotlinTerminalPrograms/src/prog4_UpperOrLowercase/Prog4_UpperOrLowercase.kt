//simple program that determines the case of the Letter the user inputs
package prog4_UpperOrLowercase

fun main() {
    val letter = isALetter("Enter one letter from the English alphabet: ")

    //this way is for when you explicitly want to exclude letters from the non-english alphabet
    when (letter.code) {
        in 97..122 -> println("$letter is in lowercase.")
        in 65..90 -> println("$letter is in uppercase.")
        else -> println("$letter is neither in upper nor lowercase.")
    }

    /* //another way but with the built-in method. This is inclusive to non-english alphabet letters.
    when  {
        letter.isLowerCase() -> println("$letter is in lowercase.")
        letter.isUpperCase()  -> println("$letter is in uppercase.")
        else -> println("$letter is neither in upper nor lowercase.")
    }
     */

}

fun isALetter(prompt: String) :Char {
    do {
        print(prompt)
        val userIn = readln()

        //this way is for explicitly only accepting English alphabet letters
        if (userIn.length != 1 || !Regex("(?i)[a-z]").matches(userIn)) { //(?i) indicates case-insensitivity. alternative: [a-zA-Z]
            println("Invalid input. Try again.")
        } else return userIn[0]

        // another way but with the built-in method. This can be used if you want to include letters beyond the English alphabet
        /*
        if (userIn.length !=1 || !userIn[0].isLetter()){
            println("Invalid input. Try again.")
        } else return userIn[0]
         */


    }while (true)
}