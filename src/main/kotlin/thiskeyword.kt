fun main() {
    val table = Table()
    println("width: ${table.width}")
    println("height: ${table.height}")

    table.resize(3, 4)
    println("width: ${table.width}")
    println("height: ${table.height}")
}

class Table {
    var width = 1
    var height = 1

    fun resize(width: Int, height: Int) {
        this.width = width
        this.height = height
    }
}