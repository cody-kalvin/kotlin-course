fun main() {
    val store = Store()
    with(store) {
        this.printInventory()
    }
}


class Store {
    private val shoes = 57
    private val shirts = 32
    private val jackets = 18

    fun printInventory() {
        println("Inventory:")
        println("$shoes pair of shoes")
        println("$shirts shirts")
        println("$jackets jackets")
    }
}