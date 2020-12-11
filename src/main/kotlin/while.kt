fun main () {
    println("Enter a large number:")
    val number = readLine()?.toIntOrNull() ?: 0

    var i = 0
    while (i <= number) {
        if (i % 7 == 0) {
            println(i)
        }
        i++
    }
}