fun main() {
    val names = listOf("Dipper", "Mabel", "Soos", "Wendy", "Stan")
    val messages = personalizedMessages(names) { name ->
        "Hi, I am $name. Welcome to Mystery Shack."
    }
    println(messages)
}

fun personalizedMessages(names: List<String>, createMessage: (String) -> String): List<String> {
    val messages = mutableListOf<String>()
    for (name in names) {
        messages.add(createMessage(name))
    }
    return messages
}