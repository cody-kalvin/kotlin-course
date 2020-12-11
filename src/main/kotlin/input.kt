import java.time.LocalDate

fun main () {
    val currentYear = LocalDate.now().year

    println("On what year were you born?")
    val input = readLine() ?: ""

    val birthYear = if (input.isNotBlank()) {
        input.toInt()
    } else {
        currentYear
    }
    println("You are about ${currentYear - birthYear} years old.")
}