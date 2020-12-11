
import java.util.Currency
import java.text.NumberFormat

fun main () {
    val client = "Mary"
    val products = 3
    val price = 3000

    val formatter = NumberFormat.getCurrencyInstance()
    formatter.maximumFractionDigits = 2
    formatter.currency = Currency.getInstance("PHP")

    val statement = "$client bought $products items worth ${formatter.format(price)} each. Total payable is ${formatter.format(products * price)}."
    println(statement)
}