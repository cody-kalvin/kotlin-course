fun main() {
    println("Enter a number:")
    val number = readLine()?.toIntOrNull() ?: 1

    for (i in 1..number) {
        for (j in 1..number) {
            val emoji = when (i * j % 3) {
                0 -> "\uD83D\uDE00"
                1 -> "\uD83E\uDD28"
                else -> "\uD83D\uDE31"
            }
            print(emoji)
        }
        println("")
    }
}