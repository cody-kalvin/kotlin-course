import java.text.NumberFormat
import java.util.*

/**
 * This can be solved using the compound interest formula.
 * But since it is an exercise about augmented assignment operators, we'll use a for-loop instead.
 */
fun main() {
    println("How much do you have in your bank account?")
    val input = readLine() ?: ""

    val principal = if (input.isNotBlank()) {
        input.toDouble()
    } else {
        0.0
    }

    var account = principal

    val interest = 0.055 // 5.5% is 5.5/100

    val years = 5

    for (i in 1..years) {
        account *= 1 + interest
    }

    val formatter = NumberFormat.getCurrencyInstance()
    formatter.maximumFractionDigits = 2
    formatter.currency = Currency.getInstance("PHP")

    println("From ${formatter.format(principal)}, you will have ${formatter.format(account)} after $years years.")
}