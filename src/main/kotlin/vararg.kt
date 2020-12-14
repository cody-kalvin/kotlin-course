fun main() {
    hello(3, "Peridot", "Lapiz", "Ruby", "Diamond")
}

fun hello(count: Int, vararg names: String) {
    for (name in names) {
        for (i in 1..count) {
            print("Hello $name. ")
        }
        println()
    }
}