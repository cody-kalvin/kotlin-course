fun main () {
    try {
        println("What do you want to buy?")
        val product = readLine()

        println("How many do you want?")
        val count = readLine()?.toInt()

        val cost = 9.99

        println("$count $product costs ${count?.times(cost)}")
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Thank you.")
    }
}