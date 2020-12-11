fun main() {
    val usernames = hashSetOf("john", "bob", "alice")
    var input: String
    var isUnique = false
    do {
        println("Enter your username:")
        input = (readLine() ?: "").toLowerCase()
        if (!usernames.contains(input)) {
            isUnique = true
        } else {
            println("Username already exists. Please try again.")
        }
    } while (!isUnique)
    usernames.add(input)
    println(usernames)
}