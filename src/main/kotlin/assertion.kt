fun main() {
    val cost = 29.99
    val default = 1

    println("Each cost $cost. How many do you want?")
    val input: String? = readLine()
    val count: Int = input?.toIntOrNull() ?: default

    println("Total is ${cost * count}.")
}