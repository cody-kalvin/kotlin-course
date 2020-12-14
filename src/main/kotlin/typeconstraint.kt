import kotlin.math.pow

fun main() {
    val square = Square(8.0)
    val squareGeometry: Geometry<Square> = Geometry(square)
    squareGeometry.printArea()

    val circle = Circle(5.0)
    val circleGeometry: Geometry<Circle> = Geometry(circle)
    circleGeometry.printArea()
}

interface Shape {
    val size: Double
    fun area(): Double
}

class Square(override val size: Double) : Shape {
    override fun area(): Double {
        return size.pow(2)
    }
}

class Circle(override val size: Double) : Shape {
    override fun area(): Double {
        return Math.PI * (size / 2).pow(2)
    }
}

class Geometry<T: Shape>(private val shape: Shape) {
    fun printArea() {
        println("Area is ${shape.area()} square units.")
    }
}