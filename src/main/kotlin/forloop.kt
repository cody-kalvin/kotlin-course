fun main() {
    println("Enter a year:")
    val year = readLine()?.toIntOrNull() ?: 0

    for (i in 1..12) {
        when (i) {
            1 -> println("January has 31 days.")
            2 -> {
                val days = if (isLeapYear(year)) 29 else 28
                println("February has $days days.")
            }
            3 -> println("March has 31 days.")
            4 -> println("April has 30 days.")
            5 -> println("May has 31 days.")
            6 -> println("June has 30 days.")
            7 -> println("July has 31 days.")
            8 -> println("August has 31 days.")
            9 -> println("September has 30 days.")
            10 -> println("October has 31 days.")
            11 -> println("November has 30 days.")
            12 -> println("December has 31 days.")
        }
    }
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0
}