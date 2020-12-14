fun main() {
    val list = mutableListOf<Int>()
    for (i in 1..10) {
        println("Enter a number:")
        val input = readLine()?.toIntOrNull()
        input?.takeIf { it % 2 != 0 }.takeUnless { listOf(3, 13).contains(it) }?.let {
            list.add(it)
        }
    }
    println(list)
}