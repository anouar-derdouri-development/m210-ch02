class Person constructor(
    firstName: String = "john",
    lastName: String = "doe",
    age: Int = 18,
    genre: String = "m"
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

    var genre = genre
        get() {
            return (if (field == genres[0]) "Male" else "Female")
        }
        set(value) {
            val v = value.lowercase()

            if (! genres.contains(v))
                throw Exception("Invalid genre ($v)")

            field = v

            courtesy = if (v == genres[0]) "Mr" else "Miss/Mrs"
        }

    lateinit var courtesy: String
        private set

    private val genres by lazy {
        arrayOf("m", "f", "M", "F")
    }

    init {
        if (this.firstName.isBlank())
            throw Exception("Invalid firstname (${this.firstName})")

        if (this.lastName.isBlank())
            throw Exception("Invalid lastname (${this.lastName})")

        if (this.age !in 17..65)
            throw Exception("Invalid age (${this.age})")

        if (! genres.contains(genre))
            throw Exception("Invalid genre ($genre)")

        courtesy = if (genre.lowercase() == genres[0]) "Mr" else "Miss/Mrs"
    }

    override fun toString(): String {
        if (this::courtesy.isInitialized)
            return "${this.courtesy}. ${this.firstName} ${this.lastName} - ${this.age} years old"

        return "${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}