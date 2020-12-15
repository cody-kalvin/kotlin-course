fun main() {
    val farmer = 1
    val cows = 3
    val cowsWithMilk = 1
    val children = 2
    val maxAnimals = 5
    val minFamily = 3
    val canReceiveFunding = cows <= maxAnimals && cowsWithMilk > 0 && (farmer + children) >= minFamily
    println(if (canReceiveFunding) "Congratulations, farmer." else "We are very sorry, farmer.")
}