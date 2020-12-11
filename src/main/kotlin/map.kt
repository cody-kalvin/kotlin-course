fun main() {
    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 3747
    println("Total number of people attended on 25 and 26 Sept is ${(attendance["25 Sept"] ?: 0) + (attendance["26 Sept"] ?: 0)}")
}