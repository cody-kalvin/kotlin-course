fun main() {
    println("Enter a name of an animal:")
    val animal = readLine() ?: ""
    val lifespan = calculateLifespan(animal)
    println("${animal}\'s lifespan is $lifespan years.")
}

fun calculateLifespan(animal: String): Int {
    return when (animal.toLowerCase()) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
}