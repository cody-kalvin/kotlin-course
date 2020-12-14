fun main() {
    val airplane = Airplane(
        name ="Plane 123",
        leftEngine = Airplane.Engine("Engine ABC"),
        rightEngine = Airplane.Engine("Engine XYZ")
    )
    airplane.takeOff()
}

data class Airplane(
    val name: String,
    val leftEngine: Engine,
    val rightEngine: Engine
) {
    fun takeOff() {
        println("Ready off...")
        leftEngine.start()
        rightEngine.start()
        println("Take off...")
    }

    data class Engine(private val name: String) {
        fun start() {
            println("Starting engine $name...")
        }
    }
}