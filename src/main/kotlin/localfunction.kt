fun main() {
    introduce()
}

fun introduce() {
    fun greet(name: String) {
        println("Nice to meet you, $name.")
    }

    while (true) {
        println("What is your name?")
        val name = readLine()
        if (name.isNullOrBlank()) {
            break
        }
        greet(name)
    }
}