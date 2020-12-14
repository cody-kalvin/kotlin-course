fun main() {
    val colonStore = Franchise()
    colonStore.sell()
}

open class Restaurant {
    protected val secretRecipe = "There is no secret. It\'s just you."
}

class Franchise: Restaurant() {
    fun sell() {
        println("Preparing burger...")
        println("Secret recipe is \"$secretRecipe\"...")
        println("Serving burger...")
    }
}