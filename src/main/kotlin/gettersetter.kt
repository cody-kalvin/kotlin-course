fun main() {
    val user = User()
    user.balance = 900.0
    println("${user.interest}")

    user.balance = 9000.0
    println("${user.interest}")

    user.balance = 10101.0
    println("${user.interest}")
}

class User {
    var balance: Double = 0.0
    set(value) {
        field = value
        interest = when {
            value < 1000 -> 1.0
            value < 10000 -> 0.5
            else -> 0.2
        }
    }

    var interest: Double = 0.0
}