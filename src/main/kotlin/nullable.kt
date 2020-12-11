fun main() {
    println("Enter a number:")
    val input = readLine()
    val result = input?.toDoubleOrNull()?.times(7)
    print("Length of ${result ?: ""} is ${(result?: "").toString().length}.")
}