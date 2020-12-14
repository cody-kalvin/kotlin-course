fun main() {
    Account()
    Account("Pedro")
    Account("Pablo", 150)
}

class Account {
    private val userName: String
    private val balance: Int

    constructor() {
        this.userName = "Juan"
        this.balance = 100
        canAfford()
    }

    constructor(userName: String) {
        this.userName = userName
        this.balance = 200
        canAfford()
    }

    constructor(userName: String, balance: Int) {
        this.userName = userName
        this.balance = balance
        canAfford()
    }

    fun canAfford() {
        println("$userName can afford ${balance / 20} shirts.")
    }
}