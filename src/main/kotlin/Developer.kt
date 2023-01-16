class Developer(
    firstName: String,
    lastName: String,
    age: Int,
    var preferredLanguage: String
) : Human(firstName, lastName, age) {

    override fun toString(): String {
        return "${super.toString()} - Preffered language: ${this.preferredLanguage}"
    }
}