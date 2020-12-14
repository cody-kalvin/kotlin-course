fun main() {
    val laptop = Laptop()
    laptop.run {
        turnOff()
        turnOn()
    }
}

class Laptop {
    fun turnOn() {
        println("Turning on...")
    }

    fun turnOff() {
        println("Turning off...")
    }
}