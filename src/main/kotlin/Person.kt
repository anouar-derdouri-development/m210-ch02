class Person constructor(
    firstName: String = "john",
    lastName: String = "doe",
    age: Int = 18,
    genre: String = "m"
) {
    companion object {
        private val mGenre by lazy {
            genres[0]
        }

        private val fGenre by lazy {
            genres[1]
        }

        private val genres by lazy {
            arrayOf("m", "f")
        }

        private fun isValidGenre(genre: String): Boolean {
            return genres.contains(genre.lowercase())
        }
    }

    var firstName = Formatting.firstName(firstName)
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

    var genre = genre.lowercase()
        get() {
            return (if (field == mGenre) "Male" else "Female") // ToDo: Improve
        }
        set(value) {
            if (!isValidGenre(value))
                throw Exception("Invalid genre ($value)")

            field = value

            courtesy = if (value == mGenre) "Mr" else "Miss/Mrs" // ToDo: Improve
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

        if (!isValidGenre(genre))
            throw Exception("Invalid genre ($genre)")

        courtesy = if (genre.lowercase() == mGenre) "Mr" else "Miss/Mrs"
    }

    override fun toString(): String {
        if (this::courtesy.isInitialized)
            return "${this.courtesy}. ${this.firstName} ${this.lastName} - ${this.age} years old"

        return "${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}