fun main() {
    val bosch = Bosch()
    bosch.cook()

    val roaster = Roaster()
    roaster.cook()
}

abstract class Oven {
    var averageCookingSpeed = 7

    open var topTemperature = 330

    abstract fun cook()
}

class Bosch: Oven() {
    override var topTemperature = 500

    override fun cook() {
        println("Bosch will cook for $averageCookingSpeed minutes at $topTemperature °C.")
    }
}

class Roaster: Oven() {
    override fun cook() {
        println("Roaster will roast for $averageCookingSpeed minutes at $topTemperature °C.")
    }
}