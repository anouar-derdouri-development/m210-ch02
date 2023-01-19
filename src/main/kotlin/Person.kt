open class Person constructor(
    firstName: String = "john",
    lastName: String = "doe",
    age: Int = 18,
    genre: Genre = Genre.M
) {
    open var firstName = Formatting.firstName(firstName)
        get() {
            return field
        }
        set(value) {
            if (value.isBlank())
                throw Exception("Invalid firstname ($value)")

            field = Formatting.firstName(value)
        }

    var lastName = Formatting.lastName(lastName)
        get() {
            return field
        }
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

    var genre = genre
        set(value) {
            field = value

            courtesy = field.courtesy()
        }

    lateinit var courtesy: String
        private set

    init {
        if (this.firstName.isBlank())
            throw Exception("Invalid firstname (${this.firstName})")

        if (this.lastName.isBlank())
            throw Exception("Invalid lastname (${this.lastName})")

        if (this.age !in 17..65)
            throw Exception("Invalid age (${this.age})")

        courtesy = when (genre) {
            Genre.M -> "Mr"
            Genre.F -> "Miss/Mrs"
        }
    }

    override fun toString(): String {
        if (this::courtesy.isInitialized)
            return "${this.courtesy}. ${this.firstName} ${this.lastName} - ${this.age} years old"

        return "${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}