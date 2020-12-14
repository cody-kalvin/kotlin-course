fun main() {
    println("Enter customer\'s name:")
    val customer = readLine() ?: ""
    val shop = JarBox()
    shop.sellCoffee(customer)
}

class JarBox {
    fun sellCoffee(customer: String) {
        Kofi().apply {
            this.customer = customer
            this.prepare()
            println("Serve coffee to ${this.customer}.")
        }
    }
}

class Kofi {
    var customer: String = ""

    fun prepare() {
        println("Prepare coffee.")
    }
}