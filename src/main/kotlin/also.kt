fun main() {
    val company = Company()

    Car("XYZ")
        .apply {
            build()
        }.also {
            company.log(it)
        }
}

class Car(val model: String) {
    fun build() {
        println("Building $model...")
    }
}

class Company {
    fun log(car: Car) {
        println("Adding ${car.model} to company records...")
    }
}