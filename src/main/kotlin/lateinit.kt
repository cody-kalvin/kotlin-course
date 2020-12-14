fun main() {
    lateinit var message: String
    val primes: List<Int> = listOf(1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31)
    message = "The chosen prime is ${primes.random()}."
    println(message)
}