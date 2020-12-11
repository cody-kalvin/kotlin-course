fun main() {
    println("Enter a double:")
    val input = readLine() ?: ""
    val double: Double = try {
        input.toDouble()
    } catch (e: Exception) {
        0.0
    }
    val pi: Double = Math.PI
    val result: Double = double * pi
    println("$double * PI = $result")
    println(result::class.java)
}