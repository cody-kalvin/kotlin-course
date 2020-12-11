fun main() {
    val hasEggs = true
    val hasBacon = false

    val eggCost = 5
    val baconCost = 20

    var total = 0

    if (hasEggs) {
        total += eggCost * 12

        if (hasBacon) {
            total += baconCost * 2
        }
    }

    println("Total spending is $total.")
}