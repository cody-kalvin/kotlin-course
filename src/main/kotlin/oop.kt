fun main() {
    val calc = Calculator()
    calc.add(12)
    println(calc.total)
    calc.subtract(8)
    println(calc.total)
    calc.multiply(3)
    println(calc.total)
    calc.divide(4)
    println(calc.total)
    calc.reset()
    println(calc.total)
}

class Calculator {
    var total: Int = 0

    fun add(num: Int) {
        total += num
    }

    fun subtract(num: Int) {
        total -= num
    }

    fun multiply(num: Int) {
        total *= num
    }

    fun divide(num: Int) {
        total /= num
    }

    fun reset() {
        total = 0
    }
}