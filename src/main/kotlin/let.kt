fun main() {
    val clients = mutableListOf<String?>()
    println("Enter client names:")
    do {
        val input = readLine()
        input?.let {
            val name = it.toLowerCase()
            when {
                name == "stop" -> return@let
                name.isNotBlank() -> clients.add(name)
                else -> clients.add(null)
            }
        }
    } while (input != "stop")
    println(clients)
}