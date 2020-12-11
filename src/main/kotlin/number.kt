import kotlin.random.Random

fun main() {
    println("Enter an integer:")
    val input = readLine() ?: ""
    val integer = try {
        input.toInt()
    } catch (e: Exception) {
        0
    }
    val double = Random.nextDouble()
    val product = integer * double
    println("$integer * $double = $product")
    println(product::class.java)
}