fun main() {
    println("Enter your score [1 to 100]:")
    val score = readLine()?.toIntOrNull() ?: 0

    val grade = if (score in 90..100) {
        "A"
    } else if (score in 80..89) {
        "B"
    } else if (score in 70..79) {
        "C"
    } else if (score in 60..79) {
        "D"
    } else if (score in 50..59) {
        "E"
    } else {
        "F"
    }
    println("Your grade is $grade")
}