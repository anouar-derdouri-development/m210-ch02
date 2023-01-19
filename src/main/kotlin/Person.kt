open class Person constructor(
    firstName: String = "john",
    lastName: String = "doe",
    age: Int = 18,
    var genre: Genre = Genre.M
) {
    open var firstName = Formatting.firstName(firstName)
        set(value) {
            if (value.isBlank())
                throw Exception("Invalid firstname ($value)")

            field = Formatting.firstName(value)
        }

    var lastName = Formatting.lastName(lastName)
        set(value) {
            if (value.isBlank())
                throw Exception("Invalid lastname ($value)")

            field = Formatting.lastName(value)
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
        return "${this.genre.courtesy()}. ${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}