class Person constructor(
    var firstName: String = "john",
    var lastName: String = "doe",
    var age: Int = 18,
) {
    init {
        if (firstName.isBlank())
            throw Exception("Invalid firstname")

        if (lastName.isBlank())
            throw Exception("Invalid lastname")

        if (age !in 17..65)
            throw Exception("Invalid age")

        firstName = firstName.substring(0, 1).uppercase() + firstName.substring(1).lowercase()
        lastName = lastName.uppercase()
    }

    override fun toString(): String {
        return "$firstName $lastName - $age years old"
    }
}