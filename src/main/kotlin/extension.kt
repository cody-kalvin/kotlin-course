fun main() {
    val list = arrayListOf(14, 22, 53, 94, 50, 62)
    list.snitchCount()
}

fun ArrayList<Int>.snitchCount() {
    println("There are ${this.size} elements inside $this.")
}