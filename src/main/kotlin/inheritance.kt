fun main() {
    val eddie = Engineer()
    eddie.name = "Engineer Eddie"
    eddie.salary = 60000.00
    eddie.work()
    eddie.work()
    eddie.study()
    eddie.work()

    val dianne = Doctor()
    dianne.name = "Doctor Dianne"
    dianne.salary = 80000.00
    dianne.work()
    dianne.work()
    dianne.study()
    dianne.work()
}

open class Job {
    var name: String = "Job"

    var salary: Double = 0.0

    var revenue: Double = 0.0

    fun work() {
        revenue += salary
        println("$name\'s total revenue is $revenue.")
    }

    fun study() {
        salary += 1000.00
        println("$name\'s salary is now $salary.")
    }
}

class Engineer: Job()

class Doctor: Job()