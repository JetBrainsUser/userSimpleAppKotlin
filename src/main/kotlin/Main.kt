class Person(val name: String, var age: Int) {
    fun displayDetails() {
        println("Name: $name, Age: $age")
    }

    fun celebrateBirthday() {
        age += 1
        println("Happy Birthday $name! You are now $age years old.")
    }

    fun isAdult(): Boolean {
        print("Checking if the person is an adult... ")
        return age >= 18
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
