fun main() {
    val olympics = Olympics()
    val philippines = olympics.awardMedal(1)
    println("Philippines awarded with ${philippines.name}")
    val vietnam = olympics.awardMedal(2)
    println("Vietnam awarded with ${vietnam.name}")
    val malaysia = olympics.awardMedal(3)
    println("Malaysia awarded with ${malaysia.name}")
    val indonesia = olympics.awardMedal(4)
    println("Indonesia awarded with ${indonesia.name}")
    val china = olympics.awardMedal(12)
    println("China awarded with ${china.name}")

}

enum class Medal {
    GOLD,
    SILVER,
    BRONZE,
    NONE
}

class Olympics {
    fun awardMedal(position: Int): Medal {
        return when(position) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }
}