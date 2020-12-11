fun main() {
    println("Enter your name:")
    val name = readLine() ?: ""

    val greeting = when (name.first().toLowerCase()) {
        in 'a'..'c' -> "Good morning, $name."
        in 'd'..'f' -> "Good afternoon, $name."
        else -> "Goodbye, $name."
    }
    println(greeting)
}