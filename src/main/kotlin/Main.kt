class Person(val name: String, var age: Int) {
    companion object {
        const val LEGAL_AGE = 18
    }

    fun displayDetails() {
        println("Name: $name, Age: $age")
    }

    fun celebrateBirthday() {
        age += 1
        println("Happy Birthday $name! You are now $age years old.")
    }

    fun isAdult(): Boolean {
        return age >= LEGAL_AGE
    }
}

fun main() {
    val person = Person("John Doe", 25)
    person.displayDetails()

    person.celebrateBirthday()

    if (person.isAdult()) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
