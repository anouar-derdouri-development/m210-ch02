class Person constructor(
    firstName: String = "john",
    lastName: String = "doe",
    age: Int = 18,
) {
    var firstName = firstName // type is inferred
        get() {
            return field.substring(0, 1).uppercase() + field.substring(1).lowercase()
        }
        set(value) {
            if (value.isBlank())
                throw Exception("Invalid firstname ($value)")

            field = value
        }

    var lastName = lastName
        get() {
            return field.uppercase()
        }
        set(value) {
            if (value.isBlank())
                throw Exception("Invalid lastname ($value)")

            field = value // Backing field: lastName
        }

    var age = age
        set(value) {
            if (value !in 17..65)
                throw Exception("Invalid age ($value)")

            field = value
        }

    init {
        if (this.firstName.isBlank())
            throw Exception("Invalid firstname (${this.firstName})")

        if (this.lastName.isBlank())
            throw Exception("Invalid lastname (${this.lastName})")

        if (this.age !in 17..65)
            throw Exception("Invalid age (${this.age})")
    }

    override fun toString(): String {
        return "${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}