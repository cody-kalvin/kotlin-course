fun main() {
   while (true) {
        println("Enter your age:")
        val input = readLine() ?: ""
        if (input.toLowerCase() == "stop") {
            break
        }

        val age = input.toIntOrNull() ?: 0
        if (age >= 18) {
            println("Welcome to the club.")
            continue
        }

        println("Sorry, but we do not accept minors.")
    }
}