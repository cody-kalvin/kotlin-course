import kotlin.random.Random

fun main() {
    val shop = CoffeeShop()
    for (i in 1..7) {
        val coffee = shop.sell()
        println("Day $i:")
        coffee.wakeUp()
        coffee.quenchThirst()
        println()
    }
}

interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}

class Arabica : Coffee {
    override fun wakeUp() {
        println("Arabica is waking you up.")
    }

    override fun quenchThirst() {
        println("Arabica is quenching your thirst.")
    }
}

class Robusta : Coffee {
    override fun wakeUp() {
        println("Robusta is waking you up.")
    }

    override fun quenchThirst() {
        println("Robusta is quenching your thirst.")
    }
}

class CoffeeShop {
    fun sell(): Coffee {
        val a = Random.nextInt()
        val b = Random.nextInt()
        return if (a > b) {
            Arabica()
        } else {
            Robusta()
        }
    }
}