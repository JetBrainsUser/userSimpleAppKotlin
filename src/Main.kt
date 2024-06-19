data class BankAccount(val bankName: String, val number: String)

class Person(val name: String, var age: Int, val telephoneNumber: String, val bankAccount: BankAccount) {
    companion object {
        const val LEGAL_AGE = 18
        const val BIRTHDAY_ANNOUNCEMENT_FORMAT = "Happy Birthday %s! You are now %d years old."
        const val ADULT_STATUS_FORMAT = "%s is %s."
        const val ADULT_STATUS = "an adult"
        const val NOT_ADULT_STATUS = "not an adult"
    }

    fun displayDetails() {
        println("Name: $name, Age: $age, Telephone Number: $telephoneNumber, Bank Account: ${bankAccount.bankName} ${bankAccount.number}")
    }

    fun celebrateBirthday() {
        age += 1
        println(String.format(BIRTHDAY_ANNOUNCEMENT_FORMAT, name, age))
    }

    private fun isLegalAge(): Boolean {
        return age >= LEGAL_AGE
    }

    fun displayAdultStatus() {
        val status = if (isLegalAge()) ADULT_STATUS else NOT_ADULT_STATUS
        println(String.format(ADULT_STATUS_FORMAT, name, status))
    }
}

fun main() {
    val bankAccount = BankAccount("Bank Name", "Account Number")
    val person = Person("John Doe", 25, "123-456-7890", bankAccount)
    person.displayDetails()
    person.celebrateBirthday()
    person.displayAdultStatus()
}