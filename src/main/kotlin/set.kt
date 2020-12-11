fun main() {
    val customers = hashSetOf("Greg", "Wirt", "Beatrice", "Enoch")
    customers.add("The Beast")
    println(customers)
    customers.remove(customers.random())
    println(customers)
}