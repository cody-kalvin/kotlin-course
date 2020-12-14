fun main() {
    val listAdapter: Adapter<List<Int>> = Adapter(listOf(1, 2, 3))
    listAdapter.convert()

    val intAdapter: Adapter<Int> = Adapter(37)
    intAdapter.convert()

    val stringAdapter: Adapter<String> = Adapter("Hi, Stranger.")
    stringAdapter.convert()
}

class Adapter<T>(private val value: T) {
    fun convert() {
        println("Your value is ${value.toString()}")
    }
}