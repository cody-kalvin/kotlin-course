import kotlin.random.Random

fun main() {
    val list = listOf(
        Random.nextInt(0, 100),
        Random.nextInt(0, 100),
        Random.nextInt(0, 100),
        Random.nextInt(0, 100),
        Random.nextInt(0, 100)
    )
    println(list)

    val higherThan25 = list.filter { it > 25 }
    println(higherThan25)
}