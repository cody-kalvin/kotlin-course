import java.time.LocalDate

fun main() {
    for (i in 1..3) {
        askNameAndBirthYear()
    }
}

fun askNameAndBirthYear() {
    println("Enter your name:")
    val name = readLine() ?: ""

    val currentYear = LocalDate.now().year

    println("Enter your birth year:")
    val birthYear = readLine()?.toIntOrNull() ?: currentYear

    println("Hi, $name. ${currentYear - birthYear} years old.")
}