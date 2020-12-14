fun main() {
    val user by lazy { NewUser() }
    val banned = listOf("joe", "john", "justin")
    println("Enter a username:")
    val input = (readLine() ?: "").toLowerCase()
    if (!banned.contains(input)) {
        user.welcome()
    }
}

class NewUser {
    fun welcome() {
        println("Welcome")
    }
}