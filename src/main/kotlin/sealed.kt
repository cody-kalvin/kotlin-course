import kotlin.random.Random

fun main() {
    val lottery = Lottery()

    for (i in 1..3) {
        val draw = lottery.draw()
        lottery.issue(draw)
    }
}

sealed class Prize {
    class Car(val model: String): Prize()
    class Vacation(val country: String): Prize()
    class GiftCard(val amount: Int): Prize()
}

class Lottery {
    fun draw(): Prize {
        val numA = Random.nextInt(1, 10000)
        val numB = Random.nextInt(1, 10000)

        return when {
            numA < numB -> Prize.GiftCard(numB)
            numB > numB -> Prize.Vacation("Singapore")
            else -> Prize.Car("XYZ")
        }
    }

    fun issue(prize: Prize) {
        when(prize) {
            is Prize.Car -> println("A brand-new ${prize.model}")
            is Prize.Vacation -> println("Round-trip for 1 to ${prize.country}")
            is Prize.GiftCard -> println("Gift card worth of ${prize.amount}")
        }
    }
}