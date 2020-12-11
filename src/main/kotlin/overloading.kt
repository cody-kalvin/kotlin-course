fun main() {
    cost(product = "Boy Bawang", price = 2.50)
    cost(map = mapOf(Pair("Halo-Halo", 1.00), Pair("Tattoos", 10.00)))
}

fun cost(product: String, price: Double) {
    println("$product costs ${price * 1.2}")
}

fun cost(map: Map<String, Double>) {
    map.forEach { (product, price) ->
        println("$product costs ${price * 1.2}")
    }
}