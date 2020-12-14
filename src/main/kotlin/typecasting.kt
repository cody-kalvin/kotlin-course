import kotlin.random.Random

fun main() {
    val list = collectAnimals()
    for (animal in list) {
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}

abstract class Animal

class Dog: Animal() {
    fun bark() {
        println("Bark bark bark")
    }
}

class Cat: Animal() {
    fun purr() {
        println("Purr")
    }
}

fun collectAnimals(): List<Animal> {
    val collection = mutableListOf<Animal>()
    for (i in 1..10) {
        val random = Random.nextInt()
        if (random % 2 == 0) {
            collection.add(Dog())
        } else {
            collection.add(Cat())
        }
    }
    return collection
}