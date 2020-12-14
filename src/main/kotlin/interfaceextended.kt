fun main() {
    val shop = RentalShop()
    val utilityCar = UtilityCar()
    shop.rent(utilityCar)
    val luxuryCar = LuxuryCar()
    shop.rent(luxuryCar)
}

interface RentalCar {
    val price: Int
    fun rent()
}

class UtilityCar: RentalCar {
    override val price: Int = 1000

    override fun rent() {
        println("Renting a utility car.")
    }
}

class LuxuryCar: RentalCar {
    override val price: Int = 3000

    override fun rent() {
        println("Renting a luxury car.")
    }
}

class RentalShop {
    fun rent(car: RentalCar) {
        car.rent()
        println("Bill is ${car.price}.")
    }
}